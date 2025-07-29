import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class StreamfileCopyOneFileToAnother {
    public static void main(String[] args)  throws IOException{
        File infile =new File("city.txt");
        File outfile=new File("state.txt");
       FileInputStream fis=null;
       FileOutputStream fop=null;
       try{
        fis=new FileInputStream(infile);
        fop=new FileOutputStream(outfile);
        int j;
        while((j=fis.read())!=-1)
        {
fop.write((char)(j));
        }

       }
       catch(IOException e)
       {
        System.out.println(e);
       }
       int k;
       FileInputStream fip=new FileInputStream("State.txt");
BufferedInputStream bis=new BufferedInputStream(fip);
while((k=bis.read())!=-1)
{
System.out.print((char)k);
}
bis.close();
    }
}
