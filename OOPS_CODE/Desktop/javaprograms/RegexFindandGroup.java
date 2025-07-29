import java.util.regex.*;

public class RegexFindandGroup {
    public static void main(String[] args) {
        String str = "sai123kumar456";
        
        // Create a pattern and matcher
        Pattern pattern = Pattern.compile("\\d+");  // Find one or more digits
        Matcher matcher = pattern.matcher(str);
        // Use find() to locate the numbers
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
