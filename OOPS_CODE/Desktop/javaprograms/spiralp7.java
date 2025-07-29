import java.util.*;
class spiralp7 {
    public static void main(String args[])
    {
        int r1,c1;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter  numbers of rows");
       r1=sc.nextInt();
        System.out.println("enter  numbers of columns");
       c1=sc.nextInt();
       int a[][]=new int[r1][c1];
       if(r1==c1)
       {
       for(int i=0;i<a.length;i++)           /* 7   8   9
                                                6   1   2
                                                5   4   3*/
       {
        for(int j=0;j<a[0].length;j++)
        {
a[i][j]=sc.nextInt();
        }       
        }
         for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a[0].length;j++)
        {
System.out.print(a[i][j]+" ");
        }  
        System.out.println();     
        }}
        else
        {
            System.out.println("enter same numbers for rows columns");
        }
    }
}