/*Arrange Primes bookmark_borderGiven an integer N. Print the count of permutations for the numbers from 1 to N, considering that prime numbers should be placed at positions with prime indices (1 - based indexing). As the result might be a large number, print the output % 1e9 + 7.

Input Format
The first and only line of input contains an integer N.

Output Format
Print the count of permutations.

Constraints
1 ≤ N ≤ 100

Example
Input
8

Output
576 */



import java.util.*;

public class ArrangePrimes{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int prime=0;
    int nonprimes=0;
    long p=1;
  long p1=1;
    for(int i=1;i<=n;i++)
    {
        int count=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            prime++;
        }
        else{
            nonprimes++;
        }
    }
 
    for(int i=1;i<=prime;i++)
    {
        p=(p*i)%1000000007;
    }
    for(int i=1;i<=nonprimes;i++)
    {
        p1=(p1*i)%1000000007;
    }
   System.out.print(p*p1%(1000000007));
    }
}