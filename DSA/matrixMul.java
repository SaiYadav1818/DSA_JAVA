import java.io.*;
import java.util.*;

public class matrixMul {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int g=1;g<=t;g++)
   {
    int n1=sc.nextInt();
    int m1=sc.nextInt();
    int[][] a=new int[n1][m1];
for(int i=0;i<n1;i++)
{
    for(int j=0;j<m1;j++)
    {
        a[i][j]=sc.nextInt();
    }
}
int n2=sc.nextInt();
int m2=sc.nextInt();
int[][] b=new int[n2][m2];
for(int i=0;i<n2;i++)
{
    for(int j=0;j<m2;j++)
    {
        b[i][j]=sc.nextInt();
    }
}
for(int i=0;i<n1;i++)
{

    for(int j=0;j<m2;j++)
    {
        int sum=0;
        for(int k=0;k<n2;k++)
        {
            sum+=a[i][k]*b[k][j];
        }
       System.out.print(sum+" ") ;  }
       System.out.println();
}

   }
     }
}