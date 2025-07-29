import java.util.Scanner;
public class marks{
    public static void main(String args[]){
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    int sum=a+b+c+d;
    float per=((float)sum/400)*100;
    System.out.println(per);
    }
}