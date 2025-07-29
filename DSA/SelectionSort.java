import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1,6,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

   public    static void  selection(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-1-i;
            int max=maxEle(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int maxEle(int[] arr,int s,int e)
    {
        int max=s;
      for(int i=s+1;i<=e;i++)
      {
if(arr[max]<arr[i])
{
    max=i;
}
      }
      return max;
   
    }
   static void swap(int[] arr,int first,int end)
    {
      int temp=arr[first];
      arr[first]=arr[end];
      arr[end]=temp;
    }
}
