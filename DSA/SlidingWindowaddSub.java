public class SlidingWindowaddSub {
 
        static ArrayList<Integer> subarraySum(int[] arr, int target) {
            // code here
            ArrayList<Integer> list=new ArrayList<>();
            int s=0,cSum=0, end=0;
       for( end=0;end<arr.length;end++)
            {
                cSum+=arr[end];
                while(cSum>target)
                {
                       cSum-=arr[s];
                       s++;
                }
                if(cSum==target)
                {
                    list.add(s+1);
                    list.add(end+1);
                    break;
                }
            
        }
        if(end==arr.length)
        {
            list.add(-1);
        }
        return list;
        }
    }

