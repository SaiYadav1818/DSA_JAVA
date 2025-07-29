import java.util.*;
class CROSSpattern {
    public static void main(String ar[])
    {
        int i,j,n;
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
     if(i==j)
        {
            System.out.print("*");
        }
        else if (i+j==n-1)
        {
            System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        }
    }
    System.out.println(" ");
}
    }
}