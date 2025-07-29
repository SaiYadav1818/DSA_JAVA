import java.util.Arrays;
import java.util.Scanner;

public class palindrome1 {
    public static boolean palindrome(String str1, String str2) {
        // Check if str1 and str2 are of the same length, if not they can't be palindromes
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert str2 to char array and reverse it
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = new char[charArray2.length];

        // Reverse str2 into charArray3
        for (int i = 0; i < str2.length(); i++) {
            charArray3[i] = charArray2[str2.length() - 1 - i];
        }

        // Convert str1 to char array for comparison
        char[] charArray1 = str1.toCharArray();

        // Compare the reversed charArray2 (charArray3) with charArray1
        return Arrays.equals(charArray1, charArray3);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.next();
        System.out.println("Enter the second string:");
        String str2 = sc.next();
        
        if (palindrome(str1, str2)) {
            System.out.print("palindrome");
        } else {
            System.out.print("not palindrome");
        }

        sc.close();
    }
}

