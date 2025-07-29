import java.util.*;
class pascal3p6 {
    public static void main(String args[])
    {
        int i,j,n;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int num=1;//for space
            for(j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            
           //int res=(int)Math.pow(11,i);
            //System.out.println(res);
            for(int k=0;k<=i;k++)
            {
           if(k==0||i==0)
           num=1;
           else {
                num=num*(i-k+1)/(k);
            
           }
            System.out.printf("%3d",num);
                }
System.out.println();
        }
        
    }
}