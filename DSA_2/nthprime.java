import java.util.Scanner;

public class nthprime{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n*n/2;
if(n==2)
{
    System.out.println(1);
}
else {
    int count;
    int c=1;
    int p=1;
    for(int i=3;i<=s;i++)
    {
        count=0;
        if(i%2==0)
        {
            continue;
        }
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            c++;
        }
        if(c==n)
        {
            p=i;
            break;
        }
    }
    System.out.print(p);
}
    }
}