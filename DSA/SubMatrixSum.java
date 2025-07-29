import java.io.*;
import java.util.*;

public class SubMatrixSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int sum=0;
   int[] a=new int[4];
   for(int i=0;i<4;i++)
   {
    a[i]=sc.nextInt();
   }   
   int[][] mat=new int[n][n];
   for(int i=0;i<n;i++)
   {
    for(int j=0;j<n;j++)
    {
        mat[i][j]=sc.nextInt();
    }
   }
   for(int i=a[0];i<=a[2];i++)
   {
    for(int j=a[1];j<=a[3];j++)
    {
        sum+=mat[i][j];
    }
   }
   System.out.print(sum);
    }
}
