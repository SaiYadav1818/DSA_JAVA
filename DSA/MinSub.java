import java.io.*;
import java.util.*;

public class MinSub {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
  long n=sc.nextLong();
long p=1;

  while(p<n)
  {
    p=p*2;
  }
 long p1=p/2;
 
 if(p==n)
 {
    System.out.print(0);
    return ;
 }
  System.out.print(n-p1);
   }
   
    }