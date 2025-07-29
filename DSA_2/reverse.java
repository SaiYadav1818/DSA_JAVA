import java.util.Scanner;
class reverse{
    public static void main(String args[])
    {
        int a,n,i=0;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
            a=n%10;
            i=(i*10)+a;
            n=n/10;
        }
        System.out.println(i);
    }
}