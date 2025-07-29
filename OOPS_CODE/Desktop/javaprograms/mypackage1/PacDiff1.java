package mypackage1;

import mypackage.PacDiff;

public class PacDiff1 extends PacDiff {
    void m2() {
        System.out.println("sub class");
      /*m1(); */  // Accessing the protected method from PacDiff
    }

    public static void main(String[] args) {
        PacDiff1 obj = new PacDiff1();
        obj.m2(); // This will call both the m2 and m1 methods
        obj.m1();
    }
}

    

