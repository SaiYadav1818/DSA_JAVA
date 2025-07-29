import java.io.*;
import java.util.*;

public class pyramidPattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int nth=(2*n)-1;
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=nth;j++)
    {
        if(j<=n-i)
        {
System.out.print(" ");
        }
        else if(j>=n+i)
        {
            System.out.print(" ");
        }
        else{
            System.out.print("*");
        }
    }
    System.out.println();
   }
    }
}