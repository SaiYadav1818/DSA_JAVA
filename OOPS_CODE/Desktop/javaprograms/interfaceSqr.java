import java.util.Scanner;

interface Number{
int findsqr(int i);
}
class A implements Number{
public int findsqr(int a)
{
    int b=a;
    return b*b;
}}


public class interfaceSqr {
  public static void main(String[] args) {
    A a =new A();
    Scanner sc =new Scanner(System.in);
    int j=sc.nextInt();
    System.out.println(a.findsqr(j));
  }  
}
