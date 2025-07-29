
import java.util.*;

public class basicCalculator {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();

   int f=sc.nextInt();
   for(int i=0;i<n-1;i++){
 String op=sc.next();
  int num=sc.nextInt();
  switch(op)
  {
    case "+":
    f+=num;
    break;
    case "-":
    f-=num;
    break;
    case "*":
    f*=num;
    break;
    case "%":
    if(num!=0){
    f=((f%num)+num)%num;}
    break;
    case "/":
    if(num!=0){
    f/=num;}
    break;

  }}
  System.out.print(f);
    }
}