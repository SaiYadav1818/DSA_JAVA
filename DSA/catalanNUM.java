import java.io.*;
import java.util.*;

public class catalanNUM {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int n1=2*n;
   int n2=n+1;
   long p1=1;
 long p2=1;
   long p3=1;
for(int i=1;i<=n1;i++)
{
    p1*=i;
}
for(int i=1;i<=n2;i++)
{
    p2*=i;
}
for(int i=1;i<=n;i++)
{
    p3*=i;
}
System.out.print(p1/(p2*p3));
    }
}