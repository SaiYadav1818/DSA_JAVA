import java.util.Arrays;

public class sCountSwaps {
    public static void main(String ar[])
    {
        int count=0;
        int[] arr={18,13,6,3,2};
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<arr.length;i++)
        {
            if(temp[i]!=arr[i])
            {
                count++;
            }
        }
        System.out.println(count/2+count%2);
       /* instead of this  if(count%2==0)
        {
            System.out.println(count/2);
        }
        else{
            System.out.println(count/2+count%2);
        }*/
    }
}
