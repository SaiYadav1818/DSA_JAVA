import java.util.HashMap;
import java.util.Map;

public class SlidingWindowLarSubArrDivByK {
    public static void main(String[] args) {
        /* 
class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        // Complete the function
        int sum=0;
        int len=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            int rem=(sum%k+k)%k;
            if(map.containsKey(rem))
            {
                len=Math.max(len,i-map.get(rem));
            }
            else{
                map.put(rem,i);
            }
        }
        return (len==Integer.MIN_VALUE)?0:len;
    }
}*/


/*import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Base case: Sum = 0 at index -1

        int maxLength = 0, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Convert 0 to -1
            sum += (nums[i] == 0) ? -1 : 1;

            // If the same sum has been seen before
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                // Store the first occurrence of this sum
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}
 */

    }
}
