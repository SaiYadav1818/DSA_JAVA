import java.io.*;
import java.util.*;

public class minMaxPar{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] arr=new int[n];
  int[] sub=new int[n];
  int sum=0;
  int k=0;
  int sum1=0;

  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt(); 
     }
   Arrays.sort(arr);
   for(int i=0;i<n-1;i++)
   {
    sub[k]=Math.abs(arr[i]-arr[i+1]);
    k++;
   }
   int min=0;
 for(int i=1;i<n-1;i++)
 {if(sub[i]<sub[min])
 {
    min=i;
 }

 }
   System.out.print(Math.abs(arr[min]-arr[min+1]));
    }
}