interface A{
    final static public String str="900";
    void m1();
}
interface B{
    void m2();
}
class C implements A,B{
    public void m1(){
        System.out.println("method1");
    }
    public void m2()
    {
        System.out.println("method2"+ " "+ str);
    }
}
public class interfaceExtends1 {
    public static void main(String[] args) {
        C obj = new C();
        obj.m1();
        obj.m2();
    }
}
