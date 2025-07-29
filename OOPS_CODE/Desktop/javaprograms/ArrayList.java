import java.util.*;

public class ArrayList {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter integers (non-integer to stop):");

while (scanner.hasNextInt()) {
    int number = scanner.nextInt();
    System.out.println( number);
}
  }
}


