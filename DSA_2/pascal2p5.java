import java.util.Scanner;

public class pascal2p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            int coef = 1;
            for (int space = 1; space <= numRows - i; space++)
                System.out.print("  "); // printing spaces to center the triangle

            for (int j = 0; j <= i; j++) {
            
              if (j == 0 || i == 0)
                    coef = 1;
               else
                    coef = coef * (i - j + 1) / j;

                System.out.printf("%4d",coef);
            }
            System.out.println();
        }
        scanner.close();
    }
}
