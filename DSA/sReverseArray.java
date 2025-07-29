import java.util.Arrays;
public class sReverseArray {
   public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6};
    int start=0,end=arr.length-1;
while(start<end)
{
    swaps.swap(arr,start,end);
start++;
        end--;
    
}
System.out.println(Arrays.toString(arr));
   } 
}
class swaps{
    static void swap(int[] arr,int s,int e)
    {
int temp=arr[s];
arr[s]=arr[e];
arr[e]=temp;
    }
}