import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
//Your code aims to create a bidirectional chat between a client and server using TCP in Java
public class NetTCPBiMyServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(3333);
        Socket s=ss.accept();
        DataInputStream din =new DataInputStream(s.getInputStream());
        DataOutputStream dop =new DataOutputStream(s.getOutputStream());
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str1="",str2="";
        while(!str1.equals("stop"))
        {
            str1=din.readUTF();
            System.out.println("client says "+str1);
            str2=br.readLine();
dop.writeUTF(str2);
dop.flush();
        }
        s.close();
ss.close();
    }}
    //learn Concurrent client-server(2 client and 1 server)