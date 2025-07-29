// Prefixed Fixed Code:
import java.util.Scanner;

public class EvenSumThreeDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // Use for or while loop to sum first n positive even numbers starting from 0 which are
// divisible by 3.
int count=0;
while(n!=0)
{
  if(count%2==0)
  {
    if(count%3==0)
    {
      sum=sum+count;
    }
  }
  count=count+2;
  n--;
}
System.out.print("Sum: "+sum);// Suffixed Fixed Code:
        sc.close();
    }
}