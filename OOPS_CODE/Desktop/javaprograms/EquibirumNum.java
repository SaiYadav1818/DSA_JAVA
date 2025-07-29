import java.util.Scanner;

public class EquibirumNum {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=a;
    int sum=0,p=1;
    while(b!=0)
    {
        int r=b%10;
        sum+=r;
        p*=r;
        b=b/10;
    }
    if(sum==p)
    {
        System.out.println("equibirum num");
    }
    else{
        System.out.println("not");
    }
 }   
}
