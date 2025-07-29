import java.io.File;

public class Streamfile6 {
    public static void main(String[] args) {
        File f1=new File("file4.txt");
        long get=f1.lastModified();
        long len=f1.length();
        System.out.println(get);
System.out.println(len);
    
    File f2=new File("file2.txt");
    if(f2.delete())//it is a boolean type
    {
        System.out.println("deleted suceesfully");
    }
    else{
        System.out.println("not delted");
    }
}}
