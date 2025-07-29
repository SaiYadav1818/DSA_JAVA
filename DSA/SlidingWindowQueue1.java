import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
class queue{
public int[] neg(int[] arr,int k)
{
    int len=arr.length-k+1;
    Queue<Integer> que=new LinkedList<>();
    for(int i=0;i<k;i++)
    {
        if(arr[i]<0)
        {
            que.offer(arr[i]);
        }
    }
int[] res=new int[len];
res[0]=(que.isEmpty())?0:que.peek();
for(int i=1;i<len;i++)
{
if(arr[i-1]<0)
{
que.poll();
}
if(arr[i+k-1]<0)
{
    que.offer(arr[i+k-1]);
}
res[i]=(que.isEmpty())?0:que.peek();
}
return res;
}
}
public class SlidingWindowQueue1 {
    public static void main(String[] args) {
        int[] arr={1,-1,3,-4,7,-3,6,7,8};
int k=3;
queue o=new queue();
int[] res1=o.neg(arr,k);
System.out.println(Arrays.toString(res1));
    }
}
