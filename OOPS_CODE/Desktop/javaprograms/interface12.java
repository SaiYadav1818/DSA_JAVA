interface a{
    default void m1()
    {
        System.out.println("first");
    }}interface c{
   static void m1()
    {
        System.out.println("second");
    }
}

public class interface12 implements a,c  {
  public void m1()
  {
    a.super.m1();
    c.m1();
  }
    public static void main(String[] args) {
        interface12 obj=new interface12();
        obj.m1();
    }
}
/*in Java cannot have concrete methods unless they are marked as default or static methods. 
In your current code, the methods m1() in both a and c interfaces are neither default nor static, which will result 
in a compilation error.

If you want to provide default implementations for m1() in the interfaces, you need to declare
 them as default methods. Additionally, when resolving the conflict between the two m1() methods in the interface12 class, 
 you need to use InterfaceName.super.m1()
 syntax to specify which interface's default method to call. */