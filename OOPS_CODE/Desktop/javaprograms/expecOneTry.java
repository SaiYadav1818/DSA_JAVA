import java.util.Scanner;

public class expecOneTry {
    public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);
          int i=scan.nextInt();
          int j;
          try{
            switch (i) {
            case 0 : 
                int zero = 0; 
                j = 92/ zero; 		
                break;
            case 1: 
                int b[ ] = null; 
                j = b[0] ; 	
                break;
              default:
                System.out.print("No exception");
         }
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
    }
}
