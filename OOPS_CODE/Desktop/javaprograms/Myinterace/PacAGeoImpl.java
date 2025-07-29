package Myinterace;

public class PacAGeoImpl {
    public static void main(String[] args) {
      AbstractGeo [] obj=new AbstractGeo[3] ;
      obj [0]=new PacACircleG(2);
      obj [1]=new PacACircleG(2);
      obj [2]=new PacACircleG(2);
      double totalarea=0;
for(int i=0;i<3;i++)
{
totalarea=totalarea+obj[i].area();
}
System.out.println(totalarea);
    }
}
