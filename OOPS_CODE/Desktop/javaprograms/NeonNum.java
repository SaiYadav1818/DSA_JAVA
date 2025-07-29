import java.util.*;
public class NeonNum {
    public static void main(String ar[])
    {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=a;
int sqrt=b*b;
int sum=0;
while(sqrt!=0)
{
int r=sqrt%10;
sum+=r;
sqrt=sqrt/10;
}
if(sum==a)
{
    System.out.print("neon num");
}
else{
    System.out.print("not ");
}
    }
}
