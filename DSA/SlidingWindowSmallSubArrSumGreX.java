/* 
public class SlidingWindowSmallSubArrSumGreX {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x = 51;
        int len = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
for (int end = 0; end < arr.length; end++) {
            sum += arr[end];  
            while (sum > x) {
                len = Math.min(len, end - start + 1); 
                sum -= arr[start];  
                start++; 
            }
        }
        System.out.println(len == Integer.MAX_VALUE ? 0 : len);
    }
}*/



public class SlidingWindowSmallSubArrSumGreX {
    public static void main(String[] args) {
        int[] arr={1,4,45,6,0,19};
        int x=51;
int k=1;
int len=Integer.MAX_VALUE;
while(k<arr.length){
    int sum=0;
for(int i=0;i<k;i++)
{

sum+=arr[i];
if(sum>x)
{
  len=k;
  break;
}
}

        for(int i=1;i<arr.length-k+1;i++)
        {
int prev=arr[i-1];
int next=arr[i+k-1];
sum=sum-prev+next;
if(sum>x)
{

    len=k;
    break;
    }


        }
if(len!=Integer.MAX_VALUE){
    break;
}
k++;
}
System.out.println(len== Integer.MAX_VALUE ? 0 : len);

    }
}