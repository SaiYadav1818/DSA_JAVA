import java.io.*;
import java.util.*;

public class ZigZagMat {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int r=sc.nextInt();
   int c=sc.nextInt();
   int[][] a=new int[r][c];
   for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
        a[i][j]=sc.nextInt();
    }
   }
for(int i=0;i<r;i++)
{
    int k=c-1;
    for(int j=0;j<c;j++)
    {
        if(i%2!=0)
        {
            System.out.print(a[i][k]+" ");
            k--;
        }
        else {
            System.out.print(a[i][j]+" ");
        }
     }
}
    }
}