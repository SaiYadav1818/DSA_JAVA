interface A {
    interface B {
        void m1();
    }
}
class pqr implements A.B {
    public void m1()
    {
        System.out.println("this is method one");
    }
}
class NESTEDinterface {
    public static void main(String args[])
    {
        pqr ob = new pqr();
        ob.m1();
    }
}