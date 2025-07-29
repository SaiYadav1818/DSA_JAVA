import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class NetUDPClientSide {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        byte[] buff = null;
         
        while (true) {
            String inp = sc.nextLine();
            buff = inp.getBytes();
            
            DatagramPacket dp = new DatagramPacket(buff, buff.length, ip, 1234);
            ds.send(dp);
            
            // Break the loop if the input is "bye"
            if (inp.equals("bye")) {
                break;
            }
        }
        sc.close();
        ds.close();
    }
}
