import java.util.Scanner;
class armstrong3
{
    public static void main(String args[]){
        int n,a,sum=0;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int orginalnum=n;
        String strnum=Integer.toString(n);
        while(n!=0)
        {
            a=n%10;
            sum=sum+(int)Math.pow(a,strnum.length());
            n=n/10;
        }
        if(orginalnum==sum)
        {
            System.out.println("armstrong");
        }
        else
        {
           System.out.println(" not armstrong"); 
        }
    }
}