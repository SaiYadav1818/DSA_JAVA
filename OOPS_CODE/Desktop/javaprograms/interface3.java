interface A {
   String p="ppp";
   String methodp();
}
interface B {
    String q="qqq";
    String methodq();
 }
 class C implements A,B{
    public String methodp()
    {
        return p+q;
    }
    public String methodq()
    {
        return q+p;
    }
 }
public class interface3 {
    public static void main(String[] args) {
     C obj = new C();
     System.out.println(obj.methodp())   ;
     System.out.println(obj.methodq())   ;
    }
}
