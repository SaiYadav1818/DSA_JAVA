
import java.util.Scanner;  
public class Swastika {
    // main() method start  
    public static void main (String[] args)  
    {  
        int rows, cols;  
        Scanner sc = new Scanner(System.in);  
     //   System.out.println("Please enter odd numbers for rows and colums to get perfect Swastika.");  
       // System.out.println("Enter total rows");  
        rows = sc.nextInt();  
       //System.out.println("Enter total colums");  
        cols = sc.nextInt();  
          
        // close Scanner class  
        sc.close();  
          
        // call swastika() method that will design Swastika for the specified rows and cols  
        swastika(rows, cols);  
    }  
static void swastika(int rows, int cols)  
{
    for(int i=0;i<=rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            if(i==0){
            if(j==0||j>=cols/2){
            System.out.print("*");}
           else{
               System.out.print(" ");
            }}
            else if(i<rows/2)
            {
                if(j==0)
                {
                    System.out.print("*");  
                }
                else if(j==cols/2)
                {
                    System.out.print("*");
                    break;
                    
                }
                else if(j<cols)
                {
                    System.out.print(" ");   
                }
               
            }
            else if(i==rows/2)
            {
System.out.print("*");
            }
            else if(i==rows)
            {
if(j==cols-1||j<=cols/2)
{
    System.out.print("*");
}
else{
    System.out.print(" ");  
}
            }
            else if(i>rows/2)
            {
                if(j==cols/2||j==cols-1)
                { System.out.print("*");

                }
                else{
                    System.out.print(" ");   
                }
            }
          
        }
        if(i==rows){
            break;
         }
         System.out.print("\n");
    }

}}