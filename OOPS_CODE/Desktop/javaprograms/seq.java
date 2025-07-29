import java.util.*;
class seq {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int n =sc.nextInt();
       System.out.println(a+" "+b);
       for(int i=2;i<n;i++)
       {
int d=(a+b)*(i+1);
 System.out.println(d);
 a=b;
 b=d;
       }
    }
}