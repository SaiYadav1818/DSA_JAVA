class First {

    static void staticMethod() {

        System.out.println("Static Method");

    }

}

 

class Static1 {

    public static void main(String[] args) {

        First first = null;

        First.staticMethod();

    }

}
