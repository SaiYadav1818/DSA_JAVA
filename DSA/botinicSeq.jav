import java.io.*;
import java.util.*;

public class botinicSeq {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] a=new int[n];
  for(int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
  }
  int i=0;
  while(i<n && a[i]<a[i+1])
  {
    i++;
  }
  if(i==0 && i==n-1)
  {
    System.out.print("false");
    return ;
  }
  while(i<n-1 && a[i]>a[i+1])
  {
    i++;
  }
 System.out.print((i==n-1)?"true":"false"); 
    }
}