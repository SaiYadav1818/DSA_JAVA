import java.util.regex.Pattern;
import java.util.regex.*;
public class RegexLookinAt {
   public static void main(String[] args) {
    String str=",.Saiyadav";
    Pattern obj=Pattern.compile("\\W+");
    Matcher match=obj.matcher(str);
   boolean is= match.lookingAt();
   System.out.println(is);
   } 
}
