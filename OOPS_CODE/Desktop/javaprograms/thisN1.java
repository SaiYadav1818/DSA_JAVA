class a {
    int n,v,f;
    a()
    {
        System.out.println("hi");
    }
a(int n)
{
    this(); 
this.n=n;
System.out.println("hello how are you "+this.n);
}
a(int v,int f)
{
    this(10);
    this.v=v;
    this.f=f;
    System.out.println("hello");
}
}
public class thisN1 {
    public static void main(String[] args) {
        a obj=new a(10,20); 
        System.out.println("java");
    }
}
/*Constructor chaining logic
 this() be the first line in any constructor if it is used.
 */