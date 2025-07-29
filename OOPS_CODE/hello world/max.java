import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first number
        System.out.println("Enter number 1:");
        int num = scanner.nextInt();

        // Initialize max and min with the first number
        int max = num;
        int min = num;

        // Loop for the remaining numbers
        for (int i = 2; i <= 5; i++) {
            System.out.println("Enter number " + i + ":");
            num = scanner.nextInt();

            // Update max if the entered number is greater
            if (num > max) {
                max = num;
            }

            // Update min if the entered number is smaller
            if (num < min) {
                min = num;
            }
        }

        scanner.close();

        // Output the maximum and minimum values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
