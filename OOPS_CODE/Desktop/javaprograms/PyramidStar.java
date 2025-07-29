public class PyramidStar {
    public static void main(String aefd[])
    {
        int r=4;
        int c=7;
        int m=c/2;
        int ri=m+1;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==r)
                {
                    System.out.print("*");
                }
else if(m==j)
{
    System.out.print("*");
m--;
break;
}
else{
    System.out.print(" ");
}
            }
            System.out.println();
        }
        for(int i=1;i<=r;i++)
        {
            for(int k=ri;k<=c;k++)
            {
                if(ri==k)
                {
                    System.out.print("*");
                    ri++;
                    break;
                }
                else{
                    System.out.println(" ");
                }
               
            }
            System.out.println();
        }
    }
}
