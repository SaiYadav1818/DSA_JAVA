import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class StreamfileSequence1 {
    public static void main(String[] args) {
        FileInputStream f1=null;
        FileInputStream f2=null;
     SequenceInputStream f3=null;
        try{
            int j;
            f1= new FileInputStream("virat1.txt");
            f2=new FileInputStream("city.txt");
            f3=new SequenceInputStream(f1,f2);
        BufferedInputStream bis=new BufferedInputStream(f3);
            BufferedOutputStream bos=new BufferedOutputStream(System.out);
            while ( (j=bis.read())!=-1) {
              bos.write((char)j);  
            }
            bis.close();
            bos.close();
            f1.close();
            f2.close();
        }
        catch(IOException E)
        {
            System.out.println(E);
        }
       

    }
}
