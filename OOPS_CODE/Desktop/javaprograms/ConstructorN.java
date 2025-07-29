class a{
    int f,g,x,y,d;
    a()
    {
System.out.println("java");
    }
    a(int f)
    {
        this();
        this.f=f;
        System.out.println("super class"+this.f);
    }
}
class b extends a
{

    b(int x,int y)
    {
    super(x);
        int z;
   this.x=x;
   this.y=y;
   z=0;
     System.out.println(this.x+" "+this.y+" "+z);  
    }
    b(int d)
    {
       this(30,40);
    this.d=d;
    System.out.println("sub class"+this.d);
    }
}
public class ConstructorN {
    public static void main(String[] args) {
        b obj=new b(50);
    }
}
