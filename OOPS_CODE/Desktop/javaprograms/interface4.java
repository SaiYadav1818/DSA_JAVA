class B implements A {
    public int  method(int i)
    {
        return i=+i*i;
    }
 }
 interface A {
    int  method(int i);
 }

public class interface4 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.method(2));
    }
}
