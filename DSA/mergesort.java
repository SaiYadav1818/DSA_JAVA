import java.util.Arrays;

public class mergesort{
    public static void main(String ars[])
    {
        int[] num={18,7,45,10,22,2,12,8,1};
        merge(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
  static  void merge(int[] num,int s,int e)
    {
if(s<e)
{
    int m=s+(e-s)/2;
merge(num,s,m);
merge(num,m+1,e);
divide(num,s,m,e);
}
    }
   static  void divide(int[] arr,int s,int m,int e)
    {
        int i=0;
        int j=0;
        int n1=m-s+1;
        int n2=e-m;
        int k=s;
        int[] t1=new int[n1];
        int[] t2=new int[n2];
        for(int f=0;f<n1;f++)
        {
            t1[f]=arr[f+s];
        }
        for(int f=0;f<n2;f++)
        {
            t2[f]=arr[m+f+1];
        }
        while(i<n1 && j<n2)
        {
            if(t1[i]<=t2[j])
            {
                arr[k]=t1[i];
                k++;
                i++;
            }
            else{
                arr[k]=t2[j];
                j++;
                k++;
            }}
            while(i<n1)
            {
                arr[k]=t1[i];
                i++;
                k++;
            }
            while(j<n2)
            {
                arr[k]=t2[j];
                k++;
                j++;
            }
        
    }
}