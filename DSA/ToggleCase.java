import java.io.*;
import java.util.*;

public class ToggleCase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
String str=sc.next();
   String str3="";
   for(int i=0;i<str.length();i++)
   {
    if(Character.isLowerCase(str.charAt(i)))
    {
        String str1=String.valueOf(str.charAt(i));
        str3+=str1.toUpperCase();
    }
    else{
        String str2=String.valueOf(str.charAt(i));
        str3+=str2.toLowerCase();
    }
   }
   System.out.print(str3);
}}
   