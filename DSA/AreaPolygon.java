
import java.util.*;

public class AreaPolygon {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] a=new int[n+1][2];
   for(int i=0;i<n;i++)
   {
for(int j=0;j<2;j++)
{
    a[i][j]=sc.nextInt();
}
   }
   a[n][0]=a[0][0];
   a[n][1]=a[0][1];
   int k=0;
   int sum=0;
   while(k<n)
   {
sum+=a[k][0]*a[k+1][1];

k++;
   }
   int l=0;
   int sum1=0;
   while(l<n)
   {
    sum1+=a[l+1][0] * a[l][1];

    l++;
   }
int diff=Math.abs(sum1-sum);
System.out.print(diff);
    }
}
/*X (xᵢ)	Y (yᵢ)
2	          3
5	         11
12	          8
9	          5
2             3
(Repeat first point)  */