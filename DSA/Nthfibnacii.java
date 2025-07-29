import java.util.*;

public class Nthfibnacii {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a=0;
   int b=1;
   for(int i=1;i<=n;i++)
   {
int temp=b;
b=a+b;
a=temp;

   }
   System.out.print(a);
    }
}
