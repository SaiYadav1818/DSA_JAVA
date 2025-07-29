import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Streamfile5 {
    public static void main(String[] args) {
        File myfile;
        myfile =new File("javaprograms","file4.txt");
        FileOutputStream fos =null;
        String names[]={"virat","anushka","vamika","akaay"};
        try{
           /*  if (!myfile.getParentFile().exists()) {
                myfile.getParentFile().mkdirs();
            }*/
fos=new FileOutputStream("file4.txt");
for(String name:names)
{
fos.write(name.getBytes());
fos.write("\n".getBytes());
}
System.out.println("your file is created and written suceesfully");
fos.close();
        }
        catch(IOException IOE)
        {
            System.out.println(IOE);
        }
    
        finally{
          try{
            if(fos!=null)
            {
fos.close();
            }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
        }
    }
}
