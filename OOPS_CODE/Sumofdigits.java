import java.util.Scanner;
public class Sumofdigits
{
    public static void main(String[] args){
        int n,sum=0,r;
System.out.print("enter any number");
Scanner ref=new Scanner(System.in);
n=ref.nextInt();
while(n>0){
    r=n%10;
    sum=sum+r;
    n=n/10;
}
System.out.print("sum of digtd"+ sum);
    }
}