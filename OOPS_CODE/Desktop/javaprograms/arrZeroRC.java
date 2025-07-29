import java.util.*;

public class arrZeroRC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][5];
        boolean rowZero[] = new boolean[5];
        boolean colZero[] = new boolean[5];
        
        // Read the matrix input
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();
                // If an element is zero, mark its row and column
                if (a[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        
        // Now update the matrix to zero out the rows and columns
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (rowZero[i] || colZero[j]) {
                    a[i][j] = 0;
                }
            }
        }
        
        // Print the updated matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
