
public class Static1N {
   static  int instanceVar; // Non-static variable

    static void staticMethod() {
        System.out.println(instanceVar); // Error: non-static variable instanceVar cannot be referenced from a static context
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
