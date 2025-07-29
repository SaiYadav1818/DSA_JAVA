import java.util.Arrays;
import java.util.Scanner;
public class anagram1 {
public static  boolean anagram(String str1,String str2)
{
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    String str4 = new String(charArray1);
System.out.println(str4);
String str = String.valueOf(charArray2);
System.out.println(str);
        return Arrays.equals(charArray1, charArray2);
}

    public static void main(String argg[])
    {
Scanner sc = new Scanner(System.in);
String str1 = sc.next();
String str2 = sc.next();   
if(anagram(str1, str2))
{
  System.out.print("anagram");  
}
else {
 
    System.out.print(" not anagram");    
}
}
}    

