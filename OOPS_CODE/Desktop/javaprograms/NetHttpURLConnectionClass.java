import java.net.*;
public class NetHttpURLConnectionClass {
  public static void main(String[] args) {
    try{
        URL url= new URL("https://www.bing.com/search?pglt=41&q=http%2F%3Alocalhost%2Fphpmyadmin&cvid=2cbb2a5458844a63afc2b70c9fbc6f2d&gs_lcrp=EgRlZGdlKgYIARAAGEAyCQgAEEUYPBj5BzIGCAEQABhAMgYIAhBFGDkyBggDEC4YQDIGCAQQABhAMgYIBRAAGEAyBggGEEUYPDIGCAcQRRg8MgYICBBFGEHSAQgyNjUxajBqMagCCLACAQ&FORM=ANSPA1&PC=DCTS");
        HttpURLConnection huc=(HttpURLConnection)url.openConnection();
        for(int i=1;i<=3;i++)
        {
            System.out.println(huc.getHeaderField(i)+ " = "+ huc.getHeaderFieldKey(i));
        }
        huc.disconnect();

    }
    catch (Exception e)
    {
        System.out.println(e);
    }
  }  
}
