import java.util.Arrays;
import java.util.Scanner;
 class anagram3 {
  public void anagram(String str1,String str2)
{
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    String str4 = new String(charArray1);
System.out.println(str4);
String str = String.valueOf(charArray2);
System.out.println(str);
if(Arrays.equals(charArray1,charArray2))
{
    System.out.println("Anagrams");
}
else
{
    System.out.println("Not Anagrams");
}   
}

    public static void main(String argg[])
    {
Scanner sc = new Scanner(System.in);
String str6 = sc.next();
String str7 = sc.next();  
anagram3 obj = new anagram3();
obj.anagram(str6,str7);
}
} 
