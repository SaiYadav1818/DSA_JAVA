import java.io.*;
import java.util.*;

public class sparseMatrix{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int[][] a=new int[n1][n2];
    for(int i=0;i<n1;i++)
    {
        for(int j=0;j<n2;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    int count=0;
    for(int i=0;i<n1;i++)
    {
        for(int j=0;j<n2;j++)
        {
            if(a[i][j]==0)
            {
                count++;
            }
        }
    }
    if(count>(n1*n2)/(2))
    {
System.out.print("Yes");
    }
    else{
        System.out.print("No");
    }
    }
}