import java.util.Arrays;
import java.util.regex.Pattern;

public class RegexSplit {

    public static void main(String[] args) {
        String str="sai123yadav125";
        Pattern obj=Pattern.compile("\\d");
        String[] str1=obj.split(str);
        String str4=Arrays.toString(str1);
        String[] str5=str4.split("//s+");
       for(String str3:str5)
       {
        System.out.println(str3);
       }
    }
}