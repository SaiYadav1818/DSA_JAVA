import java.io.*;
public class StreamCalculator {
    public static void main(String[] args)  throws IOException{
     Float PA =new Float(0);
     Float ROI =new Float(0);
     int NOY =0;
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
String tempString;
System.out.println("Enter Pricipal Amount");
System.out.flush();
tempString=in.readLine();
PA=Float.valueOf(tempString);
System.out.println("Enter rate of intrest");
tempString=in.readLine();
ROI=Float.valueOf(tempString);
System.out.println("enter of nuber of years");
tempString=in.readLine();
NOY=Integer.parseInt(tempString);
Float intrest=PA*ROI*NOY;
System.out.println(intrest);
    }
}
