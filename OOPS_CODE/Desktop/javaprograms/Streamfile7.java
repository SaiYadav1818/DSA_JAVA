import java.io.File;

public class Streamfile7 {
    public static void main(String[] args) {
        File f1=new File("file5.txt");
        String name=f1.getName();
        System.out.println(name);


        String path =f1.getParent();
        System.out.println(path);


        String parent =f1.getPath();
        System.out.println(parent);


        String path1=f1.getAbsolutePath();
        System.out.println(path1);


        File f2=new File("file6.txt");//boolean type method is renameTo
        if(f1.renameTo(f2))
        {
            System.out.println("renamed");
        }
        else{
            System.out.println("not exist");
        }
        System.out.println(f2.getName());
    }
}
