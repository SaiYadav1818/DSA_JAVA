 interface interface6 {//if you write  here public you must habe this fine as interface namw
    public final int a=10;
    static double b=20;
    int f=30;
    void m1();//we cannnot declare final ,static but it default public abstract
}
  class A implements interface6 {
public int  g=30;
public void m1()//if you declare protected you will get complie time error since yor accesing weaker modifer

    {
        System.out.println("we can print a variable in method 2 which is not declare in the interface"+b); 
     }
void m2()
{
    System.out.println(a); 
}
}
public class interface18{
    public static void main(String[] args) {
        A obj =  new A();
        obj.m1();
        obj.m2();
    }
}