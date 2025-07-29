//A Harshad number (also known as a Niven number)
class harshad{
public static int har(int n){
    int sum=0;
while(n!=0)
{

  int temp1=n%10;
  sum=sum+temp1;  
n=n/10;

}
return sum;
} }
public class HarshadNum {
    public static void main(String[] args) {
      int sum1=  harshad.har(15);
        if(18%sum1==0)
        {
            System.out.println("Harshad number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
}
