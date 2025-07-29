import java.util.Scanner;

public class RegexSplitInput {
 public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in the format 'dd mm yyyy':");
        String input = sc.nextLine();

        // Split the input string by whitespace
        String[] parts = input.split("\\s+");

        // Parse day, month, and year
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        System.out.println(day);
        System.out.println(month);
 }   
}
