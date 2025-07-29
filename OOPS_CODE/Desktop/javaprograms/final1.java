class superDemoClass {

    final int a = 20;

}

 

class subDemoClass extends superDemoClass {

    void subFunc() {

        a = 40;

        System.out.println("value of a = " + a);

    }

}

 

class final1 {

    public static void main(String[] args) {

        subDemoClass subc = new subDemoClass();

        subc.subFunc();

    }

}
