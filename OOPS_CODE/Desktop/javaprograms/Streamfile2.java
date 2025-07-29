import java.io.*;

public class Streamfile2 {
    public static void main(String[] args) {
        FileInputStream infile = null;
        BufferedInputStream bis = null;

        try {
            infile = new FileInputStream("virat1.txt");
            bis = new BufferedInputStream(infile);
            int b; 
            while ((b = bis.read()) != -1) {
                System.out.print((char) b); 
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        } finally {
            try {
                if (bis != null) {
                    bis.close(); 
                }
                if (infile != null) {
                    infile.close(); 
                }
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e);
            }
        }
    }
}


