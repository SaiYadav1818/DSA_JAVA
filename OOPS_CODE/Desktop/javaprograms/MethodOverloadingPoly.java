class abc
{
    int a,b,c;
  void m1()
    {
        System.out.println("with no parameters");
    }
  public void m1(int x)
    {
a=x;
System.out.println(a);
    }
  public   void m1(int x,int y)
    {
a=x;
b=y;
System.out.println(a+b);
    }
}
public class MethodOverloadingPoly {
    public static void main(String[] args) {
       abc obj = new abc();
       obj.m1();
       obj.m1(10);
       obj.m1(10,20); 
    }
    
}
