import java.net.*;
public class NetImpleURLClass {
   public static void main(String[] args) {
    try{
    URL url=new URL("https://www.bing.com/search?pglt=41&q=http%2F%3Alocalhost%2Fphpmyadmin&cvid=2cbb2a5458844a63afc2b70c9fbc6f2d&gs_lcrp=EgRlZGdlKgYIARAAGEAyCQgAEEUYPBj5BzIGCAEQABhAMgYIAhBFGDkyBggDEC4YQDIGCAQQABhAMgYIBRAAGEAyBggGEEUYPDIGCAcQRRg8MgYICBBFGEHSAQgyNjUxajBqMagCCLACAQ&FORM=ANSPA1&PC=DCTS");
System.out.println(url.getPort());
System.out.println(url.getHost());
System.out.println(url.getProtocol());
System.out.println(url.getFile());
System.out.println(url.getPath());
System.out.println(url.getAuthority());
System.out.println(url.getDefaultPort());
System.out.println(url.getContent());
}
catch(Exception e)
{
    System.out.println(e);
}
   } 
}
