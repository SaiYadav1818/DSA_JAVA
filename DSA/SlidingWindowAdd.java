public class SlidingWindowAdd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
int k=3;
int sum=0;
int len=arr.length-k;
for(int i=0;i<k;i++)
{
sum+=arr[i];
}
int max=sum;
for(int i=1;i<=len;i++)
{
   int  prev=arr[i-1];
int next=arr[i+k-1];
sum=sum-prev+next;
max=Math.max(max, sum);
}

System.out.println(max);
}
}
