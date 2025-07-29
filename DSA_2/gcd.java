import java.util.Scanner;
class gcd {
public static void main(String args[])
{
    int n,a,res,gre=1,j=1,i=1;
     System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter a number");
        a=sc.nextInt();
 while((i<=n)&&(j<=a))
 {
    if((n%i==0)&&(a%j==0))
    {
         gre=i;
    }
    i++;
    j++;
 }


 System.out.println(gre);
    

    
}
}