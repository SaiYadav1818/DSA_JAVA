import java.util.Scanner;
public class Point{
    private double x,p;
      private double y,q;
      public Point(double a,double b)
      {
       x=a;
        y=b;
      }
      private int slope(Point obj)
      {
       p=obj.x;
        q=obj.y;
       return q-y/p-x ;
       
      } }
      public class ConsSlope{         
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             double x1 = sc.nextDouble();
             double y1 = sc.nextDouble();
             double x2 = sc.nextDouble();
             double y2 = sc.nextDouble();
             Point p1 = new Point(x1, y1);
             Point p2 = new Point(x2, y2);
             
             System.out.print("Slope: "+p1.slope(p2));
         }
     }