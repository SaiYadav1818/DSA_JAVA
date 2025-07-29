import java.util.Scanner;
public class BinaryRepresentation {
    public static int maxZeros(int b)
    {
      int[] a=new int[100];
      int i=0,maxcount=0;
      int[] c=new int[100];
      while(b!=0)
      {
       a[i++]= b%2;
        b=b/2;
      }
      for(int k=i-1;k>=0;k--)
      {
        int count=0;
        if(a[k]==0)
        {
          while(k>=0 && a[k]!=1)
          {
            count++;
            k--;
          }
          
        }
        if(count>maxcount)
        {
          maxcount=count;
        }
      }
      return maxcount;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.print(maxZeros(n));

}}
    










/*int a=1041;
        int maxcount=0;
        int[] b=new int[100];
        int[] c=new int[100];
        int i=0,k=0;
        while(a!=0)
        {
b[i++]=a%2;
a=a/2;
        }
        for(int j=i-1;j>=0;j--)
        {
            int count=0;
            if(b[j]==0)
            {
                while(j>=0 && b[j]!=1)
                {
                    count++;
                    j--;
                }
                if(count>maxcount)
                {
                    maxcount=count;
                }
            }
            if(count>0)
            {
            c[k++]=count;}
        }
       System.out.println(maxcount);
 */