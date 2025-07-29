class A {//this is one of multiple inheritance
    protected int a=20;
    void m1(){
        System.out.println("this super class");
    }
}
interface B{
    void m2();
    int b=20;
}
interface D{
    void m4();
}
class C extends A implements B{
    public void m2()
    {
        System.out.println("this is from interface m2");
    }
    public void m4()
    {
        System.out.println("this is from interface m4");
    }
    public void m3()
    {
        super.m1();
        System.out.println(a);
        m2();
        m4();
    }
}
public class interfaceExIm {
    public static void main(String[] args) {
        C obj =new C();
        obj.m3();


    }
}
