
import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,1};
        int i=0;
       while(i<arr.length)

       {
        if(i+1!=arr[i])
        {
            int correctIndex=arr[i]-1;
            int temp=arr[i];
            arr[i]=arr[correctIndex];
            arr[correctIndex]=temp;
        }
        else{
            i++;
        }
       }
        System.out.println(Arrays.toString(arr));
    }
}
