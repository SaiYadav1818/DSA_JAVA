import java.util.*;
import java.io.*;
public class Streamfile3 {
    public static void main(String[] args) {
        File obj =new File("file1.txt");
        File obj1=new File("file3.txt");
        FileReader input=null;
        FileWriter output=null;
        try{
            input =new FileReader(obj);
            output=new FileWriter(obj1);
     
        int ch;
        while((ch=input.read())!=-1)
        {
output.write(ch);
        }
    }
    catch(IOException ioe)
    {
        System.out.println(ioe);
        System.exit(-1);
    }
    finally {
        try {
            input.close();
            output.close();
        }
        catch(IOException ioe)
        {
            
        }
    }
    }
}
