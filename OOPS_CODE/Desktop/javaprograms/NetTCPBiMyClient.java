import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
//Your code aims to create a bidirectional chat between a client and server using TCP in Java
public class NetTCPBiMyClient {
    public static void main(String[] args) throws Exception {
        Socket s=new Socket("localhost" ,3333);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dop=new DataOutputStream(s.getOutputStream());
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str1="",str2="";
while (!str1.equals("stop")) {
    str1=br.readLine();
    dop.writeUTF(str1);
dop.flush();
str2=din.readUTF();
System.out.println("Server says : "+str2);
}
dop.close();
s.close();
    }
}
