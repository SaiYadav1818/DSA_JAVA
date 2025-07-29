public class FindMissingNums {
    public static void main(String[] args) {
        int n = 15; // The range of numbers 1 to 10
        int[] a = {1, 2, 3, 4, 8, 9,12}; // Array with missing numbers
        int[] b = new int[n]; // Array to store missing numbers
        int k = 0; // Counter for missing numbers

        // Use count to iterate through 1 to n
        int count = 1;

        // Traverse through the array and find missing numbers
        for (int i = 0; i < a.length; i++) {
            while (count < a[i]) {
                b[k++] = count; // Store missing number in b
                count++;
            }
            count = a[i] + 1; // Move count to next number after current element
        }
        System.out.println(count);
        // If there are numbers left after the last element of `a`
        while (count <= n) {
            b[k++] = count;
            count++;
        }
        // Print the missing numbers
        System.out.println("Missing numbers:");
        for (int i = 0; i < k; i++) {
            System.out.println(b[i]);
        }
    }
}


