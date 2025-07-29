import java.util.*;

public class LSAWithEqualNum01 {
    public static void main(String[] args) {
        int[] arr={0,1,0};
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int len=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=(arr[i]==0)?-1:1;

if(map.containsKey(sum))
{
    len=Math.max(len, i-map.get(sum));
}
else{
    map.put(sum,i);

}
        }
        System.out.println(len);
    }

}
/*
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
    Map<Integer,Integer> map=new HashMap<>();
    int len=Integer.MIN_VALUE;

    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
        if(sum==k)
        {
        len=  Math.max(len,i+1);
        }
        if(map.containsKey(sum-k))
        {
          len=Math.max(len,i-map.get(sum-k));  
        }
        
       
            map.putIfAbsent(sum,i);
        
    }
        return len==Integer.MIN_VALUE?0:len;
    }
} */