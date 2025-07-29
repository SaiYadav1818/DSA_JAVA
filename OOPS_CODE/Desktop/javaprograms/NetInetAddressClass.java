import java.net.*;
public class NetInetAddressClass {
  public static void main(String[] args) {
    

    try{
    InetAddress ip =InetAddress.getByName("https://www.youtube.com/feed/history");
System.out.println(ip.getHostAddress());
System.out.println(ip.getHostName());

}
catch(Exception E)
{
    System.out.println(E);
}
}  }
