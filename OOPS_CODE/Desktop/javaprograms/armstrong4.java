import java.util.Scanner;
public class armstrong4 {
    public static void main(String[] args) {
        int n,count=0,temp;
        int sum=0,p=1,temp3;
        Scanner obj =new Scanner(System.in); 
        n= obj.nextInt();
        int temp2=n;
        while(n!=0)
        {
           
            temp=n/10;
n=n%10;
n=temp;
count++;

        }
        n=temp2;
    
while(n!=0)
{
    temp=n/10;
    temp3=n%10;
    n=temp;
    for(int i=1;i<=count;i++)
    {
p=p*temp3;
    }
    sum=sum+p;
    p=1;
}
     
System.out.println(sum);
    }
}
