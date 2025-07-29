import java.util.Scanner;

public class PrimeNumSumRange{
    //Code to create function primesum(), compute the sum of all prime numbers in a given range.
public static int primeSum(int x1,int y1)
{int count=0;
  
  for(int i=x1;i<=y1;i++)
  {
    int sum=0;
    for(int j=1;j<=i;j++)
    {
      if(i%j==0)
      {
        sum++;
      }
    }
    if(sum==2)
    {
      count=count+i;
    }
  }
 return count;
}
public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
		
	    System.out.print(primeSum(x, y));
	}
}