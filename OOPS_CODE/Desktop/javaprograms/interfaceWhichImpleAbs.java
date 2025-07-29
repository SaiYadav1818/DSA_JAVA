interface A {
    void m1();
}
abstract class B implements A {
    public void m1()
    {
        System.out.println("abstract classes and methods");
    }
    abstract void m2();//with out this also fine
}
class C extends B{
    public void m2()
    {
        System.out.println("this is concreate class");
    }
}
public class interfaceWhichImpleAbs {
    public static void main(String[] args) {
        
 
    C obj =new C();
obj.m1();
}}
