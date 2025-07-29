import java.util.Arrays;
import java.util.Scanner;
 class anagram {
 String str1;
 String str2;/*
  String str8;
 String str9; */
    anagram(String str1,String str2){
this.str1=str1;
this.str2=str2;
/*str8=str1;
str9=str2; */
    }
 boolean Methodanagram()
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
}}
class anagram4 {
    public static void main(String argg[])
    {
Scanner sc = new Scanner(System.in);
String str1 = sc.next();
String str2 = sc.next();   
anagram obj =new anagram(str1, str2);
System.out.println(obj.Methodanagram());
}
}