class xyz{
    private int a;
public void set(int x)
{
    a=x;
}
public int get()
{
    return ++a;
}
}
public class Encapsulation {
    public static void main(String ards[])

    {
xyz obj=new xyz();
obj.set(10);
System.out.println(obj.get());
    }
}
