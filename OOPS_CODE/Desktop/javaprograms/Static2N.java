public class Static2N {
  static   void nonStaticMethod() {
        System.out.println("Non-static method");
    }

    static void staticMethod() {
        nonStaticMethod(); // Error: non-static method nonStaticMethod() cannot be referenced from a static context
    }

    public static void main(String[] args) {
        staticMethod();
    }
}

