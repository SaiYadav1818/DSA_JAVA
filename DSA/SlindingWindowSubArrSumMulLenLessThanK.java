public class SlindingWindowSubArrSumMulLenLessThanK {
    public static void main(String[] args) {
   int[] nums={1,2,3,4,5};
   int k=10;
           
                int len=1;
                int count=0;
                
                while(len<nums.length)
                {
                    int sum=0;
                    for(int i=0;i<len;i++)
                    {
                        sum+=nums[i];
                    }
                     if(sum*len<k)
                    {
                        count++;
                    }
                    for(int i=1;i<=nums.length-len;i++)
                    {
                        int prev=nums[i-1];
                        int next=nums[i+len-1];
                        sum=sum-prev+next;
                        if(sum*len<k)
                        {
                            count++;
                        }
                    }
                    len++;
                }
               System.out.println(count);
            }
        }
    

/*class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long count = 0;
        long sum = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            
            // Slide the window to ensure sum * length < k
            while (sum * (right - left + 1) >= k) {
                sum -= nums[left];
                left++;
            }
            
            // All subarrays ending at 'right' and starting between 'left' and 'right' are valid
            count += (right - left + 1);
        }
        
        return count;
    }
}
 */
/*

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        Set<Character> set=new HashSet<>();
        int max=0;
        int right=0;
        int left=0;
 while(right<s.length() )
   {
     if(!set.contains(s.charAt(right)))
     {
         set.add(s.charAt(right));
         right++;
     }
     else{
         set.remove(s.charAt(left));
         left++;
     }
    max= Math.max(max,right-left+1);
  }
  return max-1;
    }
}
     */