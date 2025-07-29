
public class SlidingWindowDiff {
    public static void main(String[] args) {
        int[] arr={2,1,14,15,4,3};
    
        int sum1=0;
        int count=0;
        int sum2=0;
        
            for(int i=0;i<arr.length;i++)
            {sum1=0;
                sum1+=arr[i];
                for(int  j=i;j<arr.length;j++)
                {
sum2+=arr[j];
if(Math.abs(sum1-sum2)==1 ||Math.abs(sum1-sum2)==0 || Math.abs(sum1-sum2)==2 )
{
count++;
}
sum2=0;
                }
            }
        
        System.out.println(count);
    }
}
