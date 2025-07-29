import java.util.*;
class IllegalArgumentException extends Exception {
  public IllegalArgumentException(String message) {
    super(message);
  }
}

public class Exception2 {
    public static void main(String[] args) {
     // int n = 18;
      Scanner input = new Scanner(System.in);
      int n=input.nextInt();
      trynumber(n);
    }
   // write a function to check an integer as a parameter and throws an exception if the number is odd.
 public static void trynumber(int n){
    // // try catch implementation here
       try
       {
        checkEvenNumber(n);
       }
    catch (IllegalArgumentException e){
      System.out.print("Error: " + e.getMessage());
    }
     }
     public static void checkEvenNumber(int d) throws IllegalArgumentException {
    // // throw exception in required format here
    
        if(d%2==0)
         {
           System.out.print(d+" is even.");
         }
         else
         {
           throw new IllegalArgumentException(d+" is odd.");
         }
       
    
     }
        
        }