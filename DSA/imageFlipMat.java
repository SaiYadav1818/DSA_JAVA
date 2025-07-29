import java.io.*;
import java.util.*;

public class imageFlipMat {

static void swap(int[][] arr,int i,int j,int k)
{
    int temp=arr[i][j];
    arr[i][j]=arr[i][k];
    arr[i][k]=temp;
}
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
    int j=0;
    int k=c-1;
    while(j<=k){
swap(a,i,j,k);
j++;
k--;
}
   }
   for(int i=0;i<r;i++)
   {
    for(int f=0;f<c;f++)
    {
        if(a[i][f]==0)
        {
            a[i][f]=1;
        }
        else{
            a[i][f]=0;
        }
    }
   }
   for(int i=0;i<r;i++)
   {
    for(int f=0;f<c;f++)
    {
        System.out.print(a[i][f]+" ");
    }
    System.out.println();
   }
    }
}