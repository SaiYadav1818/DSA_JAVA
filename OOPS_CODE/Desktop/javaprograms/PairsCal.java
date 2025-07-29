public class PairsCal {
    public static void main(String[] args) {
        int[] ar={10,20,30,10,20,10,30,40,10,50,60};
        int n=ar.length;
        int count=0;
for(int i=0;i<n;i++)
{
    if(ar[i]!=0)
    {
        for(int j=i+1;j<n;j++)
        {
            if(ar[j]==ar[i])
            {
              count++;
              ar[j]=0; 
              break; 
            }
        }
    }
}
System.out.println(count);
    }
}
