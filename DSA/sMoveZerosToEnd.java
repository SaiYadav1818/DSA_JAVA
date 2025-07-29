import java.util.Arrays;

public class sMoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,5,4};
        int[] res=new int[arr.length];
        int l=arr.length-1;
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
res[l]=0;
l--;
            }
            else{
                res[k++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
