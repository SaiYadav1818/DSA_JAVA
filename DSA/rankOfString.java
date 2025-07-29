import java.util.Scanner;

public class rankOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int i=0;
        int sum=0;
        int count=0;
        while(i<str.length()-1)
        {
            count=0;
            int a=(int) str.charAt(i);
for(int j=i+1;j<str.length();j++)
{
    int b=(int) str.charAt(j);
    if(a>b)
    {
        count++;
    }
}
int p=1;
int l=str.length()-i-1;
for(int k=1;k<=l;k++)
{
    p*=k;
}
int p1=p*count;
sum+=p1;
i++;
        }
        
System.out.println(sum+1);
    }
}
