import java.util.*;

public class Solution{
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
        int xor = 0;
        int n = A.size();

        // Step 1: XOR all elements of the array
        for (int num : A) {
            xor ^= num;
        }

        // XOR with numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        // Step 2: Get the rightmost set bit
        int rightmostSetBit = xor & -xor;

        int x = 0, y = 0;

        // Step 3: Divide into two groups based on the rightmost set bit
        for (int num : A) {
            if ((num & rightmostSetBit) != 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i & rightmostSetBit) != 0) {
                x ^= i;
            } else {
                y ^= i;
            }
        }
// Step 4: Identify repeated and missing elements
        for (int num : A) {
            if (num == x) {
                list.add(x); // x is the repeated element
                list.add(y); // y is the missing element
                break;
            } 
            else if (num == y) {
                list.add(y); // y is the repeated element
                list.add(x); // x is the missing element
                break;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 1, 2, 5, 3);
        Solution solution = new Solution();
        ArrayList<Integer> result = solution.repeatedNumber(arr);
        System.out.println("Repeated element: " + result.get(0));
        System.out.println("Missing element: " + result.get(1));
    }
}

