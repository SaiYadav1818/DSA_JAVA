import java.util.Arrays;

public class quicksortFirstP {
    public static void main(String[] args) {
        int[] num={18,7,10,15,22,45,2,1,1};
        quicksort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
    static void quicksort(int[] num,int low,int high)
    {
        if(low<high)
        {  
            int pi=partition(num,low,high);
            quicksort(num, low, pi-1);
            quicksort(num, pi+1,high);
        }
    }
    static int partition(int[] num,int left,int right)
    {
        int low=left+1;
        int high=right;
        int p=num[left];
        while (low<=high) {
          while(low<=high && num[low]<=p)
          {
            low++;
          }  
          while (low<=high && num[high]>p) {
            high--;
          }
          if(low<high)
          {
            swap(num,low,high);
          }
        }
        swap(num,left,high);
        return high;
    }
static void swap(int[] num,int i,int j)
{
    int temp=num[i];
    num[i]=num[j];
    num[j]=temp;
}
}
