import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Streamfilee9 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("virat1.txt");
        BufferedOutputStream bos=new BufferedOutputStream(f1);
        String str="hello";
        byte[] b=str.getBytes();
bos.write(b);
bos.flush();
bos.close();
System.out.println("sucesss");
    }
}
