import java.net.*;
public class NetReceiver {
 public static void main(String[] args) throws Exception {
    DatagramSocket ds=new DatagramSocket(3001);
    byte[] buf=new byte[1024];
    DatagramPacket dp =new DatagramPacket(buf, 1024);
    ds.receive(dp);
    String str=new String(dp.getData() ,0,dp.getLength());
    System.out.println(str);
    ds.close();
 }   
}
