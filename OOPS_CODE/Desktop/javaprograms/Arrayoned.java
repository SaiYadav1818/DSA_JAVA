import java.util.*;
class Arrayoned {
    public static void main(String ar[])
    {
       /* int[] x;
        //int x[];
        x=new int[5];*/
       /* int x[]=new int[5];*/
         int x[]=new int[]{1,2,3,4};
for(int i=0;i<4;i++)
{
    x[i]=i*2;
}
for(int i=0;i<4;i++)
{
   System.out.print(x[i]+" ");
}
    }
}