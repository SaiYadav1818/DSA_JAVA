import java.io.DataOutputStream;
import java.net.Socket;

public class NetTCPMyClient {
    public static void main(String[] args) {
        try{
        Socket s=new Socket("localhost",6666);
DataOutputStream dop =new DataOutputStream(s.getOutputStream());
dop.writeUTF("hello tiger");
dop.flush();
dop.close();
}
catch(Exception e)
{
    System.out.println(e);
}
    }
}
