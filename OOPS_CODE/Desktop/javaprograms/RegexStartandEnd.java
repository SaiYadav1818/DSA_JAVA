import java.util.regex.Pattern;
import java.util.regex.*;;
public class RegexStartandEnd {
    public static void main(String[] args) {
        String str="sai1818";
        Pattern obj=Pattern.compile("\\D+");
        Matcher match=obj.matcher(str);
while(match.find())
{
    System.out.println(match.start() +"and"+match.end());
}
    }
}
