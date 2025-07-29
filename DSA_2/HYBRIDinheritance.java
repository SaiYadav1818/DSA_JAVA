//single inheritance and hierarical inhritance
class A {
    int a=10,b=13;
    void m1()
    {
        System.out.println(a);
    }
}
class B extends A  {
    int e=20;
    void m2()
    {
        int x=20;
        int d= a+b+x;
        System.out.println(d);
    }
}
class c extends B {
    int f=30;
    void m3()
    {
         System.out.println(f);
    }
}
class d extends B {
    void m4()
    {
         System.out.println("this is method four");
    }
}
class e extends B {
    void m5()
    {
         System.out.println("this is method five");
    }
}
class f extends c {
    void m6()
    {
       System.out.println("this is method six"); 
    }
}
class HYBRIDinheritance {
    public static void main(String arg[]){
        B obj = new B();
        obj.m2();
        obj.m1();
        f obj1 = new f();
        obj1.m6();
        obj1.m3();
    }
}