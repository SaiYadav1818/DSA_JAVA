import java.util.HashMap;

public class MapCountFrequency {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 5, 2, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
 // Print the frequency map
        System.out.println("Frequency of numbers: " + map);
         // Find the maximum frequency
         int maxFrequency = 0;
         for (int frequency : map.values()) {
             if (frequency > maxFrequency) {
                 maxFrequency = frequency;
             }
         }
 
         System.out.println("Maximum frequency: " + maxFrequency);
         System.out.print("Key(s) with the maximum frequency: ");
         for (var entry : map.entrySet()) {
             if (entry.getValue() == maxFrequency) {
                 System.out.print(entry.getKey() + " ");
             }
         }
    }
}

