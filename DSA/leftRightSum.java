import java.io.*;
import java.util.*;

public class leftRightSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int[] a=new int[n];
   int[] b=new int[n];
   for(int i=0;i<n;i++)
   {
    a[i]=sc.nextInt();
   }
  int left=0;
  int j=0;
  int right=0;
  int g=0;
  while(g<n)
  {
    int k=g;
if(k==0)
{
    left=0;
}
 if(k==n-1)
{
    right=0;
}
int s=k-1;
while(s>=0 && k<n )
{
left+=a[s];
s--;
}
int f=k+1;
while(f<n)
{
right+=a[f];
f++;
}
b[j++]=Math.abs(left-right);
left=0;
right=0;
g++;
  }
  for(int i=0;i<b.length;i++)
  {
    System.out.print(b[i]+" ");
  }
    }
}