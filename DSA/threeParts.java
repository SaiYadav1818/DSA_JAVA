import java.io.*;
import java.util.*;

public class threeParts {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int[] a=new int[n];
   int sum=0;
   for(int i=0;i<n;i++)
   {
a[i]=sc.nextInt();
sum+=a[i];
   }
  if(sum%3!=0)
  {
    System.out.print(false);
    return;
  }
  int currentSum=0;
  int d=sum/3;
  int i;
  int count=0;
  for(i=0;i<n;i++)
  {
  currentSum+=a[i];
  if(currentSum==d)
  {
count++;
currentSum=0;
  }
  if(count==2 && i<n-1)
  {
System.out.print(true);
return;
  }
  }
  System.out.print(false);
    }
}