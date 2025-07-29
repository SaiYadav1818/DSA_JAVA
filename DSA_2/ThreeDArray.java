class ThreeDArray {
    public static void main(String args[])
    {
        int i,j,k;
        int a[][][]=new int[4][4][5];
    for(i=0;i<3;i++)
        for(j=0;j<4;j++)
            for(k=0;k<5;k++)
                a[i][j][k]=i*j*k;
            
        System.out.print(a[i][j][k]+" ");
   System.out.println();
        }
      
        
       
    }
}