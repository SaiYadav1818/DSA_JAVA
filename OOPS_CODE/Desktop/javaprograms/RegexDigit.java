import java.util.Arrays;
public class RegexDigit {
 public static void main(String[] args) {
    String str="yadav188sai1818";
    String[] str2 =str.split("\\d");
    String str4=Arrays.toString(str2);
    String[] str3=str4.split("\\s");
    for(String str1:str3)
    {
        System.out.println(str1);
    }
    for(String str5:str2)
    {
        System.out.println(str5);
    }
System.out.println(Arrays.toString(str2));
 }   
}
