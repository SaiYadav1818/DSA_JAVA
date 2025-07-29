class abc {
    int a;
    void m1(int x)
    { /*method over ridding */
        a=x;
    
        System.out.println(a);
    }
void m2()/*method two are overloading */
{
    System.out.println("second method");
}
void m2(int x)
{
    a=x;
    System.out.println("second method"+a);
}
}
class pqr extends abc 
{
    int a;
 void m1()
{
    System.out.println("subclass method");
}
}
public class MethodOverriddingPlusOverloadingPoly {
    public static void main(String[] args) {
        pqr obj =new pqr();
        obj.m1(10);
        obj.m2();
        obj.m2(2);
        abc obj1 = new abc();
        obj1.m1(20);
    }
}
