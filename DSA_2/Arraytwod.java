import java.util.*;
class Arraytwod {
    public static void main(String ar[])
    {
      /*int x[][]=new int [5][4];*/
         int x[][]=new int[5][];//for row size
for(int i=0;i<5;i++)
{
    x[i]=new int[4]; //for column size
}
for(int i=0;i<5;i++)
{
    for(int j=0;j<4;j++)
    {
        x[i][j]=i+j;
    }
}
for(int i=0;i<5;i++)
{
    for(int j=0;j<4;j++)
    {
        System.out.print(x[i][j]);
    }
     System.out.println();
}


    }
}