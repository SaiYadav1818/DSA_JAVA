import java.util.*;
public class arrPatternRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[40];
        int b[]=new int[40];
        int c[]=new int[40];
        System.out.println("enter a array size");
        int n= sc.nextInt();
        System.out.println("enter a no of sub array elements");
        int m=sc.nextInt();
for(int i=0;i<n;i++)
{
    a[i]=sc.nextInt();
}
System.out.println("enter sub array elements");
for(int i=0;i<m;i++)
{
    b[i]=sc.nextInt();
}
int sum=0;
int k=0;
int h=0;

    for(int j=1;j<n;j++)
    {
        sum=a[h]+a[j];
        for(int i=0;i<m;i++)
        {
         
         if(sum==b[i])
         {
            c[k++]=b[i];
            break;
         }
    }
    h++;
}
System.out.println("matched elemts are ");
for(int i=0;i<k;i++)
{
    System.out.print("["+c[i]+"],");
}
System.out.println(k);
}}
