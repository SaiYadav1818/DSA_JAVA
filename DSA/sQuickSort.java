import java.util.*;
public class sQuickSort {
    public static void quick(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int p=partition(arr, low, high);
            //recurive finctions 
            quick(arr,low,p-1); //left subarray
            quick(arr,p+1,high);//right subarray
        }
    }
    public static int partition(int[] arr,int low ,int high)
    {
        int i=low-1;
        int p=arr[high];
for(int j=low;j<high;j++)
{
if(arr[j]<=p)
{
    i++;
    swap(arr,i,j);
}
}
swap(arr,i+1,high);
return i+1;
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
      int[] arr={3,5,2,17,8,3,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
