import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Streamfile4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
Float f1=new Float(0);
String tempString =reader.readLine();
f1=Float.valueOf(tempString);
int number=0;
String tempString1=reader.readLine();
number=Integer.parseInt(tempString1);
}
catch(IOException ioe)
{
    System.out.println(ioe);
}
    }
}
