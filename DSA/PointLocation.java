import java.io.*;
import java.util.*;

public class PointLocation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   int[][] a=new int[3][2];
 for(int i=0;i<3;i++)
 {
    for(int j=0;j<2;j++)
    {
        a[i][j]=sc.nextInt();
    }
 }
 int d1=a[1][0]-a[0][0];
 int d2=a[1][1]-a[0][1];
 int v1=a[2][0]-a[0][0];
 int v2=a[2][1]-a[0][1];
 int cost=d1*v2 - d2*v1;
 if(cost>0)
 {
    System.out.print("LEFT");
 }
 else if(cost<0)
 {
    System.out.print("RIGHT");
 }
 else{
    System.out.print("TOUCH");
 }
    }
}
/*Find the direction vector of the line P1 → P2:

D=(x2−x1,y2−y1)
V=(x3−x1,y3−y1)

Cross Product=(x2−x1)×(y3−y1)−(y2−y1)×(x3−x1)
Interpret the result:

If cross product > 0 → P3 is on the LEFT of the line.
If cross product < 0 → P3 is on the RIGHT of the line.
If cross product = 0 → P3 is on the LINE (TOUCH). */