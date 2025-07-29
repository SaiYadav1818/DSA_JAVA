/*import java.util.Arrays;

public class RemoveDuplicateArr {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 2, 8,4, 5, 6, 8,8,8,110};
        int n = a.length;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n-1 ; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        // Add the last element
        temp[j++] = a[n - 1];

        // Copy back to original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        

        // Print the array without duplicates
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
*/
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateArr {
    public static void main(String[] args) {
int c=0;

        int[] a = {1, 1, 2, 3, 2, 8,4, 5, 6, 8,8,8,110};
        LinkedHashSet<Integer> un=new LinkedHashSet<>();
        for(int i=0;i<a.length;i++)
        {
            un.add(a[i]);
        } 
      int[] uni=new int[un.size()];
      for(Integer num:un)
      {
        uni[c++]=num;
      }
      System.out.println(Arrays.toString(uni));
    }}