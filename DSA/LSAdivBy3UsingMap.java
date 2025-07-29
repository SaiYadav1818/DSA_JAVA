import java.util.HashMap;
import java.util.*;
public class LSAdivBy3UsingMap {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int sum=0;
        int len=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0, -1);
        for( int i=0;i<arr.length;i++)
        {
sum+=arr[i];
int re=(sum%3+3)%3;
if(map.containsKey(re))
{
    len=Math.max(len,i-(map.get(re)));
}
else{
    map.put(re,i);
}
        }
        System.out.println(len);
    }
}
