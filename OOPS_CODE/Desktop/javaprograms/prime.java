import java.util.*;
class prime {
    public static void main(String args[])
    {
        int i,f=1,s=1,n,j,q;
         int fact=0;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        boolean firstFactor = true;
       for(i=1;i<=n;i++)
       {
        if(n%i==0)
        {
            int sum=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+1;
                }
        
            }
            if(sum==2)
                {
                while(n!=0)
                {
                  q=  n%i;
                    n=q;
                    System.out.println(i);
                }
                 
                  /* if (!firstFactor) //to remove first x
                        System.out.print("x");
                    f = i;
                    System.out.print(f);
                    firstFactor = false;*/
                }
        }
       }
    }
}