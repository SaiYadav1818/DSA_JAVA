import java.util.*;
public class Palindrome {
    public static boolean palidrome(String str1,String str2)
    {
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();
        char[] charArray3=new char[charArray2.length];
       for(int i=0;i<str2.length();i++)
       {
     charArray3[i]=charArray2[str2.length()-1-i];
       }

        return Arrays.equals(charArray1,charArray3);

    }
    public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
String str1=sc.next();
String str2 =sc.next();
if(palidrome(str1, str2))
{
    System.out.print("palidrome");
}
else{
    System.out.print("not palidrome");
}
}    
}
