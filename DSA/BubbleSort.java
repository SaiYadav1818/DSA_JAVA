import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,5,1,6,3};
        boolean swap;
        for(int i=0;i<arr.length;i++)
        {
            swap=false;
            for(int j=1;j<arr.length-i;j++)
{
    if(arr[j-1]<arr[j])
    {
    int temp =arr[j];
arr[j]=arr[j-1];
arr[j-1]=temp;
swap=true;
    }
}
if(!swap)
{
    break;
}
}
        System.out.println(Arrays.toString(arr));
    }
}
