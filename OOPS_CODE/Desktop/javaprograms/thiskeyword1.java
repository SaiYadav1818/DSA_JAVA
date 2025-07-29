class a
{
    int x,y;
    a()
    { 
        /*this.x=22;*/
this(20);
        System.out.println("default constructor"+x);
    }
    a(int x)
    {
       y=x;
        System.out.println("parameter constructor"+y+x);
    }
    a(a obj)
    {
       y=obj.y;
        System.out.println("copy consrtuctor"+y);
    }
}
class thiskeyword1 {
    public static void main(String[] args) {
       a obj =new a();
       a obj1 =new a(30);
       a obj2 =new a(obj1);
    }
}
