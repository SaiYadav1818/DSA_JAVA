public class Static3N {
    static int nonStaticVar = 10; // Non-static variable

    public static void main(String[] args) {
        System.out.println(nonStaticVar); // Error: non-static variable nonStaticVar cannot be referenced from a static context
    }
}

