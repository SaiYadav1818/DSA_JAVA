
public class  expection4 {
    public static void main(String[] args) {
        try {
            int a = 10;
            try {
                int b = a / 0; // This will cause an ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner try-catch: Cannot divide by zero");
            }
        } catch (Exception e) {
            System.out.println("Outer try-catch: Some other exception occurred");
        }
        System.out.println("End of program");
    }
}
