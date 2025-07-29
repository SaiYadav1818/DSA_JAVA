import java.util.Arrays;

public class sRearrangeArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] res=new int[arr.length];
        int i=0,j=arr.length-1;
        int index=0;
        while (i<=j) {
      if(index%2==0)
      {
        res[index]=arr[j];
        j--;
      }
      else{
res[index]=arr[i];
i++;
      }
      index++;
        }
        System.out.println(Arrays.toString(res));
    }
}
