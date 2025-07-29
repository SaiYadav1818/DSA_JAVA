import java.util.Scanner;

public class StringBuilder1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1=sc.next();
        int n=sc.nextInt();
       /*  try{
        StringBuilder sb=new StringBuilder(s1);
        sb.setCharAt(n,'a');
        System.out.println(sb.toString());
    }
catch(Exception e)
{
    System.out.println("exception occured");
}*/
try{
byte[] barr=s1.getBytes();
  byte b1=(byte) 'a';
  System.out.print(b1);
  barr[n]=b1;
  System.out.print(new String(barr));
}
catch(Exception e)
{
  System.out.print("exception occur");
}
}
}
