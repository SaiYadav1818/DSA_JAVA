import java.util.*;

public class anagram2 {

    public static void main(String[] args) {
      Scanner  sc = new Scanner(System.in);
      String str11 = sc.next();
      String str22 =sc.next();
      String str1=str11.toUpperCase();
      String str2 =str22.toUpperCase();
      char[] char1=str1.toCharArray();
      char[] char2=str2.toCharArray();
    Arrays.sort(char1);
    Arrays.sort(char2);
    if(Arrays.equals(char1,char2))
    {
        System.out.println("Anagrams");
    }
    else
    {
        System.out.println("Not Anagrams");
    } 
    }}