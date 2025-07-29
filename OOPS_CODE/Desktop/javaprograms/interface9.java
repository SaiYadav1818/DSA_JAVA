interface a{
    public String str="virat";
    public void display();
}
interface b extends a{
    public String str="kohli";
    public void display1();
}
class c implements b{
    public void display()
    {
        System.out.println("circle: "+a.str);
    }
    public void display1()
    {
        System.out.println("circle: "+b.str);
    }
}
public class interface9{
    public static void main(String[] args) {
        c obj=new c();
        obj.display();
        obj.display1();
    }
}
/*In Java, interfaces cannot use super to access variables like classes do. Also, when you declare variables in an interface, 
they are implicitly public, static, and final. This means you cannot use super to reference
 variables from interfaces in the way
 you are attempting.

In your code, a.super.str and b.super.str are invalid because:

super in interfaces is only used to refer to default methods, not variables.
Interface variables are static, so they should be accessed using the interface name, like a.str or b.str. */