import java.util.*;
public class substring {

    public static void main(String[] args) {
        ArrayList<String> list=generateStrings("","25");
        System.out.println(list.toString());
    }
    public static ArrayList<String> generateStrings(String p,String str){
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char c=str.charAt(0);
        ArrayList<String> left=generateStrings(p, str.substring(1));
        ArrayList<String> right=generateStrings(p+c, str.substring(1));
        left.addAll(right);
        return left;
    }
}
/*import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 201;
        String s = String.valueOf(n);
        Set<String> result = new HashSet<>();
        
        // Generate all substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                // Generate all permutations of substrings
                generatePermutations(sub, "", result);
            }
        }
        
        // Print result
        for (String res : result) {
            System.out.print("\"" + res + "\" ");
        }
    }

    // Function to generate permutations
    static void generatePermutations(String s, String current, Set<String> result) {
        if (s.isEmpty()) {
            result.add(current);
            return;
        }
        
        for (int i = 0; i < s.length(); i++) {
            String newStr = s.substring(0, i) + s.substring(i + 1);
            generatePermutations(newStr, current + s.charAt(i), result);
        }
    }
}
 */