import java.io.*;
import java.util.*;

public class numRev {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
  int sum=0;
   int i=0;
   while(n!=0)
   {
int r=n%10;
sum=sum*10+r;
i++;
n=n/10;
   }
  System.out.print(sum);
    }
}
