import java.util.*;
public class ConvertFirstLetterCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(str1.length()+str2.length());
if(str1.length()>str2.length())
{
    System.out.println("No");
}
else
{
    System.out.println("Yes"); 
}
String modified = str1.substring(0, 1).toUpperCase() + str1.substring(1);
String modified1 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
System.out.println(modified+" "+modified1);
    }
}
