import java.util.Arrays;

public class SlidingWindowChoc {
    public static void main(String[] args) {
        int[] arr={3,4,1,9,56,7,9,12};
        int k=5;
Arrays.sort(arr);
int max2=Integer.MAX_VALUE;
for(int i=0;i<=arr.length-k;i++)
{
int max1=arr[i+k-1]-arr[i];
max2=Math.min(max2,max1);
}
System.out.println(max2);
    }
}
