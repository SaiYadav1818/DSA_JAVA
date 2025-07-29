class P{
    public void dis(){
    System.out.println("java");
}}
class Q extends P{
    public void dis(){
       
    System.out.println("nptl");
}
}
class R extends Q{
    public void dis()
    {
        super.dis();
        System.out.println("course");
    }
}
public class Hirarchy {
    public static void main(String[] args) {
        R obj=new R();
        obj.dis();
        }
}
