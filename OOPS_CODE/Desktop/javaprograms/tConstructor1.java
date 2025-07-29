class Circle {
    double x;
    double z=10;
    double u=10;
    double e=10;
    double y;
    double r;
    Circle()
    {
       System.out.println("thi is default constructor");
    }
    Circle(double a,double b,double c)
    {
x=a;
y=b;
r=c;
    }
    Circle(Circle d)
    {
        x= d.x;
        y=d.y;
        r=d.r;/* 
               x= d.z;
       y=d.u;
       r=d.e;*/
    }
double add()
    {

        return x;
    }
    double area()
    {
        return 2*r;
    }
}
public class tConstructor1 {
    public static void main(String[] args) {
        
        Circle obj = new Circle();
        Circle obj1=new Circle(2,3,4);
        Circle obj2 =new  Circle(obj1);
        System.out.println(obj.add());
        System.out.println(obj.area());  
        System.out.println(obj1.add());
        System.out.println(obj1.area()); 
        System.out.println(obj2.add());
        System.out.println(obj2.area());
    }
}
