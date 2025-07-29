import java.io.*;
import java.util.*;

public class palindromePattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nth=2*n-1;
    for(int i=1;i<=n;i++)
    {
        int k=i-1;
        for(int j=1;j<=nth;j++)
        {
            if(j>=i*2)
            {
                System.out.print(" ");
            }
          else if(j<=i){
           System.out.print((char)('A'+j-1)+" ");
    
          }
          else{
            System.out.print((char)('A'+2*i-1-j)+" ");
          }
        }
        System.out.println();
    }
    
    }
}