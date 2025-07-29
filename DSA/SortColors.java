//Dutch National Flag 
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,2,1,2,0};
        sortcolors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortcolors(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
        switch (arr[mid]) {
            case 0:
                swap(arr,low,mid);
                low++;
                mid++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                swap(arr, mid, high);
                
                high--;
                break;
            default:
            System.out.println("1 to 2 colors");
                break;
        }}}
       public static void  swap(int[] arr,int i,int j)
       {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
       }
    
}
