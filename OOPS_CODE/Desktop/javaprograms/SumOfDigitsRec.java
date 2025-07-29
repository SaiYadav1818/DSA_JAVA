import java.util.*;
public class SumOfDigitsRec {
        public int sumOf(int n)
        {
      if(n<10)
      {
return n;
      }
    else{
        return (n%10+sumOf(n/10));
    }
    }
 
        public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
SumOfDigitsRec obj=new  SumOfDigitsRec();
if(n<0)
{
    System.out.print("enter postive integer only");
}
else{
  
    int red=obj.sumOf(n);
System.out.println(red);}
    }
}
