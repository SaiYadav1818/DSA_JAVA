//it is for just 4 digit number of armstrong
import java.util.Scanner;
class armstrong{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in   );
        int n,a,b,c,d,e,f,g,arm;
        System.out.println("enter a number");
        n=sc.nextInt();
        a=n%10;
        b=n/10;
        c=b%10;
        d=b/10;
        e=d%10;  
        f=d/10;
        g=f%10;
        arm=(a*a*a*a)+(c*c*c*c)+(e*e*e*e)+(g*g*g*g);
        if(arm==n)
        {
            System.out.println("armstrong");
        }
        else{
            System.out.println("not a armstrong");
        }

    }
}