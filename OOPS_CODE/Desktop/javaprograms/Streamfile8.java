import java.io.*;
public class Streamfile8 {
    public static void main(String[] args) {
File dir=new File("mypackage");
if(dir.isDirectory())
{
    String[] file =dir.list();
    if(file!=null)
    {
        for(String str:file)
        {
            System.out.println(str);
        }
    }
    else{
        System.out.println("there is no files in that directory");
    }
}
else{
    System.out.print("it is not directiry");
}
    }
}
/* 
        File f1=new File("newdir1/file7.txt");
        File f2=new File("newdir1");
        if(f1.mkdirs())
        {
            System.out.println("directory suceesfully created");
        }
        else
        {
            System.out.println("not created");
        }
        if(f2.mkdirs())
        {
            System.out.println("directory suceesfully created");
        }
        else
        {
            System.out.println("not created");
        }*/