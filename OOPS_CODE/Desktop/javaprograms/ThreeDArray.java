class ThreeDArray {
    public static void main(String args[])
    {
        int i,j,k;
        int [][][] thr=new int[3][5][2];
    for(i=0;i<3;i++)
    {
        for(j=0;j<5;j++)
        {
            for(k=0;k<2;k++)
            {
                thr[i][j][k]=i+j+k;
            }
        }
    }
    for(i=0;i<3;i++)
    {
        for(j=0;j<5;j++)
        {
            for(k=0;k<2;k++)
            {
               System.out.print( thr[i][j][k]+" ");
            }
            System.out.println( );
        }
        System.out.println( );
    }
    }
}