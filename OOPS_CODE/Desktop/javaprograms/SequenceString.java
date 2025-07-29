class Vowelclass {
    public int res(String str, String vowels) {
        int count = 0;

        // Iterate through each group of 5 characters
        for (int i = 0; i <= str.length() - 5; i++) {
            String group = str.substring(i, i + 5); // Extract a group of 5 characters
            if (containsVowel(group, vowels)) {
                count++;
            }
        }
        return count;
    }

    // Method to check if a group of characters contains at least one vowel
    static boolean containsVowel(String group, String vowels) {
        for (int i = 0; i < group.length(); i++) {
            char c = group.charAt(i);
            if (vowels.indexOf(c) != -1) { // Check if character is a vowel
                return true;
            }
        }
        return false;
    }
}

public class SequenceString {
    public static void main(String[] args) {
        String str = "engineering";
        String vowels = "aeiou";
        
        Vowelclass obj = new Vowelclass();
        System.out.println("Number of groups with at least one vowel: " + obj.res(str, vowels));
    }
}
