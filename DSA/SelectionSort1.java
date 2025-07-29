import java.io.*;
import java.util.*;

public class SelectionSort1{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int[] a=new int[n];
   for(int i=0;i<n;i++)
   {
a[i]=sc.nextInt();
   }
   for(int i=0;i<n-1;i++)
   {
    int minIndex=i;
    for(int j=i+1;j<n;j++)
    {
        if(a[minIndex]>a[j])
        {
           minIndex=j;
        }}
        if(i!=minIndex)
        {
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
    
    for(int k=0;k<n;k++)
    {
        System.out.print(a[k]+" ");
    }
    System.out.println();
   }
    }
}