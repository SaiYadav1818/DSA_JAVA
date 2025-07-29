import java.io.IOException;
import java.io.RandomAccessFile;

public class StreamfileRandomAccess {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file=new RandomAccessFile("rad.txt","rw");
        file.writeChar('X');
        file.writeInt(18);
file.writeDouble(100);
file.seek(0);
System.out.println(file.readChar());
System.out.println(file.readInt());
System.out.println(file.readDouble());
file.seek(2);
System.out.println(file.readInt());
System.out.println(file.readDouble());
file.seek(file.length());
file.writeBoolean(false);
file.seek(file.length()-1);
System.out.println(file.readBoolean());
file.close();
}
}
