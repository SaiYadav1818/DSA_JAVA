import java.util.Scanner;
abstract class Shape {
    public abstract void draw();
  
    public abstract double calculateArea();
  }
  class Circle extends Shape
{
  int a;
  Circle(int r)
  {
    a=r;
  }
    public void draw()
  {
    System.out.println("Drawing a circle");
  }
  public double  calculateArea()
  {
    double ar=Math.PI*a*a;
    return ar;
  }
}
class Cylinder extends Shape
{
  int a,b;
  Cylinder(int r,int h)
  {
    a=r;
    b=h;
  }
    public void draw()
  {
    System.out.println("Drawing a cylinder");
  }
  public double calculateArea()
  {
    double  are=2*Math.PI*a*(b+a);
    return are;
  }
}

public class abstractMethod1 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
      int radius = in.nextInt();
      int height = in.nextInt();

      Shape circle = new Circle(radius);
      Shape cylinder = new Cylinder(radius, height);
  
      drawShapeAndCalculateArea(circle);
      drawShapeAndCalculateArea(cylinder);
    }
    public static void drawShapeAndCalculateArea(Shape shape) {
        shape.draw();
        double area = shape.calculateArea();
        System.out.printf("Area: %.4f%n", area);
      }
}
