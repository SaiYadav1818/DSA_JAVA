import java.util.*;

public class ArrOccuranceElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // Input array
      //  System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

       // System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Element to remove
    //    System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Removing element and printing result
        System.out.println("Original Array: " + Arrays.toString(array));
        array = removeAll(array, elementToRemove);
        System.out.print("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
    }
    public static int[] removeAll(int[] array1 ,int reEle)
    {
        int count=0;
        
        for(int num:array1)
        {
            if(reEle==num)
            {
                count++;
            }
        }
        int[] res=new int[array1.length-count];
      int j=0;
      for(int i=0;i<array1.length;i++)
      {
      if(reEle!=array1[i])
      {
        res[j++]=array1[i];
      }
        
      }
      return res;
    
    }}