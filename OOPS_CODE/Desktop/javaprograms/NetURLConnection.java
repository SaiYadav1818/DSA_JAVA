import java.io.*;
import java.net.*;
public class NetURLConnection {
    public static void main(String[] args) {
        try{
            URL url =new URL("https://www.bing.com/search?pglt=41&q=http%2F%3Alocalhost%2Fphpmyadmin&cvid=2cbb2a5458844a63afc2b70c9fbc6f2d&gs_lcrp=EgRlZGdlKgYIARAAGEAyCQgAEEUYPBj5BzIGCAEQABhAMgYIAhBFGDkyBggDEC4YQDIGCAQQABhAMgYIBRAAGEAyBggGEEUYPDIGCAcQRRg8MgYICBBFGEHSAQgyNjUxajBqMagCCLACAQ&FORM=ANSPA1&PC=DCTS");
        URLConnection urlcon=url.openConnection();
        InputStream is=urlcon.getInputStream();
        int i;
        while((i=is.read())!=-1)
        {
System.out.println((char)i);
       
}

    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}}
