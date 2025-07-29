import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class NetUDPServerSide {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];
        DatagramPacket dp = null;
        
        while (true) {
            dp = new DatagramPacket(receive, receive.length);
            ds.receive(dp);
            
            String receivedData = data(receive);
            System.out.println("Client: " + receivedData);
            
            // Exit condition on receiving "bye" message
            if (receivedData.equals("bye")) {
                System.out.println("Client sent bye... exiting");
                break;
            }
            
            // Clear the receive buffer for the next message
            receive = new byte[65535];
        }
        ds.close();
    }

    // Method to convert byte array data to a string
    public static String data(byte[] a) {
        if (a == null) return null;
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (a[i] != 0) {
            result.append((char) a[i]);
            i++;
        }
        return result.toString();
    }
}

