public class Triplet {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5,2,2,2};
        int k=3;
int len=arr.length-k+1;
System.out.println(len);
int count=0;
for(int i=0;i<len;i++)
{

    if(arr[i]==arr[i+1]&&arr[i]==arr[i+2])
    {
        count++;
      
    }
    else if(arr[i]+1==arr[i+1]&&arr[i]+2==arr[i+2])
    {
        count++;
    
    }
}

System.out.println(count);
    }
}
