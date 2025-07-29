//Friendly pairs (also called amicable numbers)
class FP{
static   String fun(int n1,int n2)
    {
  int sum1=Divisors(n1);
  int sum2=Divisors(n2);
int res1=sum1/n1;
int res2 =sum2/n2;
if(res1==res2)
{
    return "Friendly pair";
}
else
{
    return "Not Friendly pair";
}

    } 
 static   int Divisors(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
         if(n%i==0)
         {
 sum=sum+i; 
         }
     
        }  
        return sum;
    }}

public class Friendlypair {
    public static void main(String[] args) {
       System.out.println(FP.fun(6,28));  
    }
}
