public class Static4N {
    public static void main(String[] args) {
        /*static*/ int x = 5; // Error: illegal start of expression
        System.out.println(x);
    }
}
/*You cannot declare a local variable as static inside a method. */
