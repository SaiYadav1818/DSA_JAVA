import java.util.Scanner;
class halfdob {
public static void main(String args[])
{
    int n,res;
     System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
   if(n%2==0)
   {
    res = n >> 1; //if number is even half it
     System.out.println(res);
   }
    else
    {
        res = n << 1; //if number is even double it
         System.out.println(res);
    }   
    System.out.println(12>>2);
    
}
}