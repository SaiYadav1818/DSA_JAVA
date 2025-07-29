import java.util.Arrays;
import java.util.regex.Pattern;
public class RegexMatcher {
    public static void main(String[] args) {
        String str="124";
        String str2="saiyadav124";
        Pattern  obj=Pattern.compile(str);
        String[] res=obj.split(str);
        String[] res1=obj.split(str2);
        String str1=Arrays.toString(res);
        String str3=Arrays.toString(res1);
        System.out.println(str3);

        String s="1234";
        boolean yn=Pattern.matches("\\d+",s);
        System.out.println(yn);
    }
}
