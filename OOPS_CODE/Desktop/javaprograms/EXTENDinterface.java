interface A {
    void m1();
    void m2();
}
interface B   {
    void m3();
    void m4();
}
interface c extends Modular ,B {
void m5();
}
class d  implements c {
 public  void m1(){
        System.out.println("this is method one");
    }
    public  void m2(){
        System.out.println("this is method 2");
    }
    public  void m3(){
        System.out.println("this is method 3");
    }
    public void m4(){
        System.out.println("this is method 4");
    }
     public void m5(){
        System.out.println("this is method 5");
    }
}
class EXTENDinterface 
{   public static void main(String[] args){
d obj = new d();
obj.m1();
obj.m2();
obj.m3();
obj.m4();
}}