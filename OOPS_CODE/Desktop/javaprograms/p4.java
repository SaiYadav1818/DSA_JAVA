import java.util.Scanner;
class p4 {
public static void main(String args[])
{
    int i,j,n,k=0,num=1;
     System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    while(k!=n)
    {
               int res= (int)Math.pow(11,(k));
                System.out.println(res);
                k++;
    }
        System.out.println();
    
}
}