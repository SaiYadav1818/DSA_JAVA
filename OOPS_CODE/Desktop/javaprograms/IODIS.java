import java.io.BufferedReader;
import java.io.InputStreamReader;
public class IODIS {
    public static void main(String[] args) {
        float f;
        int a;
Float r=new Float(0);
try{
    BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
    String tenpString;
    System.out.println("enter prinicipal amount");
    System.out.flush();
    tenpString=dis.readLine();
    r=  Float.valueOf(tenpString);
    a=Integer.valueOf(tenpString);
    f=Float.parseFloat(tenpString);
    System.out.println(f);
    System.out.println(a);
}
catch(Exception e) {
    System.out.println("handled");
}
    }
}
