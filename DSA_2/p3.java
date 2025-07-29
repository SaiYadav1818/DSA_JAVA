import java.util.Scanner;
class p3 {
public static void main(String args[])
{
    int i,j,n,k,num=1;
     System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
    }
}
}

