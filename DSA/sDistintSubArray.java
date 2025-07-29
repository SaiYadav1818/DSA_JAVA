import java.util.*;

public class sDistintSubArray {
    public static void countDistinctInWindow(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            System.out.println("Window size is larger than array size.");
            return;
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        result.add(freqMap.size()); // Store count of first window

        // Slide the window
        for (int i = 1; i <n-k+1; i++) {
            int outgoing = arr[i - 1]; // Element going out
            int incoming = arr[i+k-1]; // Element coming in

            // Remove outgoing element from map
            freqMap.put(outgoing, freqMap.get(outgoing) - 1);
            if (freqMap.get(outgoing) == 0) {
                freqMap.remove(outgoing); // Remove if count becomes zero
            }

            // Add incoming element
            freqMap.put(incoming, freqMap.getOrDefault(incoming, 0) + 1);

            // Store result
            result.add(freqMap.size());
        }

        // Print the distinct counts for each window
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        countDistinctInWindow(arr, k);
    }
}
/*import java.util.*;

public class DistinctElementsUsingSet {
    public static void countDistinctInWindow(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            System.out.println("Window size is larger than array size.");
            return;
        }

        List<Integer> result = new ArrayList<>();
        Set<Integer> distinctSet = new HashSet<>();

        // Process first window
        for (int i = 0; i < k; i++) {
            distinctSet.add(arr[i]);
        }
        result.add(distinctSet.size()); // Store count of first window

        // Slide the window
        for (int i = 1; i <= n - k; i++) {
            // Remove the outgoing element
            distinctSet.remove(arr[i - 1]);

            // Add the new incoming element
            distinctSet.add(arr[i + k - 1]);

            // Store the distinct count for the current window
            result.add(distinctSet.size());
        }

        // Print the distinct counts for each window
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        countDistinctInWindow(arr, k);
    }
}
 */
/*class Solution {
    static int countOfSubstrings(String s, int k) {
      int count=0;
        Map<Character,Integer> map=new HashMap<>();
    for(int i=0;i<k;i++)
    {
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
        for(int i=1;i<s.length()-k+1;i++)
        {
              if(map.size()==k-1)
          {
              count++;
          }
           map.put(s.charAt(i+k-1),map.getOrDefault(s.charAt(i+k-1),0)+1);
          map.put(s.charAt(i-1),map.getOrDefault(s.charAt(i-1),0)-1);
          if(map.get(s.charAt(i-1))==0)
          {
              map.remove(s.charAt(i-1));
          }
        
        }
          if(map.size()==k-1)
          {
              count++;
          }
      return count;
    }
}; */