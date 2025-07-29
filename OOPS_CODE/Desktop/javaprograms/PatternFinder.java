/*[2,3,2,4,2,4,2,4,5,6]*/
import java.util.*;
public class PatternFinder {
public static void main(String[] args) {
    System.out.println("enter array size");
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int i;
    int a[]=new int[30];
    int c[]=new int[30];
System.out.println("enter array elements");
for(i=0;i<n;i++)
{
  a[i]=sc.nextInt();  
}
boolean found=false;
System.out.println("enter subarray size");
int m=sc.nextInt();
System.out.println("how many times repeted sub array");
int k=sc.nextInt();
for( i=0;i<=n-k*m;i++)
{
     found=true;
for(int j=1;j<k;j++)
{
for(int l=0;l<m;l++)
{
    if(a[i+l]!=a[i+j*m+l])
    {
        found=false;
        break;
    }

    if(!found)
    {
        found=false;
        break;
    }
}
}
if(found)
{
System.out.print("valid pattern is ");
for(int g=i;g<i+m;g++)
{
System.out.print(a[g]+" ");
}
System.out.println();
break;
}
}
if(!found)
{
    System.out.print("not valid pattern is ");
}
}

}
    


