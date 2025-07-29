
import java.util.*;

public class FloydPattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=1;
for(int  i=1;i<=n;i++)
{
    k=n-1;
    int k1=i;
    for(int j=1;j<=i;j++)
    {
        if(j==1){
System.out.print(i+" ");}
else{

    System.out.print(k1+k+" ");
    k1=k1+k;
    k--;
  
}

    }
    System.out.println();
}
    }
    }
