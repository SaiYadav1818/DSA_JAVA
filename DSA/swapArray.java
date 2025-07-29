import java.util.Arrays;
class swapArray{
    public static void main(String aef[])
    {
        int[] arr={1,2,3,4,5};
        swapping.swap1(arr,1,2);
        System.out.println(Arrays.toString(arr));
    }
}
class swapping{
static void swap1(int[] arr,int index1,int index2)
{
    int temp=arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;
}
}