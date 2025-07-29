import java.util.Scanner;
class gcd {
public static void main(String args[])
{
    int n,a,gre=1,i=1;
     System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter a number");
        a=sc.nextInt();
        if(n==0&&a==0)
        {
         gre=0;
        }
       else if(n==0)
{
   gre=a;
}
else if(a==0)
{
   gre=n;
}
        else{
 while((i<=n)&&(i<=a))
 {

  if((n%i==0)&&(a%i==0))
    {
         gre=i;
    }
    i++;
 }
        }
 System.out.println(gre);
 if(n==0||a==0)
 {
 System.out.print("lcm "+0);
 }
 else{
 System.out.println("lcm "+" "+n*a/gre);}
}
}