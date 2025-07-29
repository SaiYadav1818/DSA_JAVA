interface A {
    void cal(int item);
}

class B implements A{
    int x;
    public void cal(int item)
    {
x=item*item;
    }
}
class C implements A{
    int x;
    public void cal(int item)
    {
x=item/item;
    }
}
public class interface6 {
    public static void main(String[] args) {
        B obj=new B();
        C obj1 = new C();
        obj.x=0;
        obj1.x=0;
        obj.cal(2);//again we are updating x value
        obj1.cal(2);
    System.out.println(obj.x+" "+ obj1.x);
    }
}
