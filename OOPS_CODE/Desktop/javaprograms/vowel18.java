import java.util.Scanner;
public class vowel18{
public static void main(String args[])
{
  int count=0;
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  for(int i=0;i<s.length();i++)
  {
    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
    {
      count++;
    }
  }
 System.out.print(count);
  
}
}
