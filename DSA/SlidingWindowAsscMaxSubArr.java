public class SlidingWindowAsscMaxSubArr {
    public static void main(String[] args) {
        int[] arr={12,13,14,5,2,3,4};
        int sum=arr[0];
        int sum1=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                sum+=arr[i];
            }
            else{
                sum1=Math.max(sum1,sum);
                sum=arr[i];
            }
        }
        System.out.println(Math.max(sum,sum1));
    }
}

