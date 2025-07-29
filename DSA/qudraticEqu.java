import java.io.*;
import java.util.*;

public class qudraticEqu {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d1=b*b-4*a*c;
double d=Math.sqrt(d1);
if(d>=0)
{
double  r1= (-b+d)/(2*a);
  double  r2=(-b-d)/(2*a);
  System.out.printf("%.2f %.2f ",r1,r2);
}
else
{
    /*
     *  double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.printf("Complex Roots: %.2f + %.2fi and %.2f - %.2fi\n", 
                               realPart, imaginaryPart, realPart, imaginaryPart);
     */
System.out.print("Imaginary Roots");
}
    }
}