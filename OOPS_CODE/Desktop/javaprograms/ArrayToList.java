import java.util.Arrays;
import java.util.List;
public class ArrayToList {
 public static void main(String[] args) {
    int[] ar={1,2,3,4};
    Integer[] a =new Integer[ar.length];
    for(int i=0;i<ar.length;i++)
    {
        a[i]=ar[i];
    }
    List<Integer> list=Arrays.asList(a);
    System.out.println(list);
  }   
}
