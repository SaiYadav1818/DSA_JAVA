import java.util.Scanner;
 class Point {
    private double x,p,q;
      private double y;
      public Point(double a,double b)
      {
       x=a;
        y=b;
      }
      public double slope(Point obj)
      {
        System.out.println(x);
     p=obj.x;
     q=obj.y;
     System.out.println(p);
       return (q-y)/(p-x) ;
       
      } }
      public class PassByObjCon{         
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