import java.util.Scanner;
class adddigit1{
    public static void main(String args[]){
        int sum=0,n,a;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
            a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.println(sum);
    }
}