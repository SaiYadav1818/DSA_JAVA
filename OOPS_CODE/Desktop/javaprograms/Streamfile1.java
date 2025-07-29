import java.io.*;
public class Streamfile1 {
public static void main(String[] args) {
   byte cities[]={'D','E','L','I','\n','A'};
FileOutputStream outfile =null;
try{
    outfile =new FileOutputStream("city.txt");
    outfile.write(cities);
    outfile.close();
}
catch(IOException ioe)
{
    System.out.println(ioe);
    System.exit(-1);
}
} 
}
