package Myinterace;

public class PacShapeImpl {
    static void display(int x,int y)
    {
System.out.println("Area="+ x+" "+"Peri="+" "+y);
    }
    public static void main(String[] args) {
       /*  PacCircleS obj=new PacCircleS(20);
        PacCircleS obj1=new PacCircleS(30);
       System.out.println( obj.area());
       System.out.println(obj1.peri());
       PacRectS obj2=new PacRectS(20,30);
     System.out.println(obj2.area());  
       obj2.peri();*/
       PacCircleS obj=new PacCircleS(20);
       display(obj.area(),obj.peri());

    }
}
