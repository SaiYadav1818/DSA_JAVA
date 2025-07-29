//excessive number
class amb{
        static int  ambdend(int n)
        {
            int sum=0;
            for(int i=1;i<n;i++){
            if(n%i==0)
            {
                sum=sum+i;}
            }
            return sum;
        }  }
        public class Ambdendnum {
            public static void main(String[] args) {
int sum1=amb.ambdend(18);
if(sum1>18)
{
    int s=sum1-18;
    System.out.println("ambdend number"+s);
}
else
{
    System.out.print("Not ambdend number");
}
    }
}
