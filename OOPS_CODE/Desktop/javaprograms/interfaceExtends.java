interface A{
    void m1();
    final int a=10;
}
interface B extends A {
    void m2();

}//abstract class
abstract class C implements B{ //if you want to  implement onlt one methods then we must use abstract keyword

    public void m2()
        {
            System.out.println("extends");
        }
public abstract void m1();
}
 abstract class D extends C{//Concrete Class
public void m1()
{
    System.out.println("extends");   
}
 }
 class E extends D{
void m4()// m4() in class E is specific to E and is not related to the interface methods
{
System.out.println(a);
}
}
public class interfaceExtends{
    public static void main(String[] args) {
    E obj=new E();
        obj.m2();
    }
}
/*Class E is a concrete class because it provides implementations 
for all abstract methods inherited from D (which, in turn, implemented 
abstract methods from C */