import java.util.Arrays;

public class sNextPermutation {
    public static void nextPer(int[] arr){
        int i=arr.length-2;
    while(i>=0 && arr[i]>=arr[i+1])    
    {
  i--;
    }
    int j=arr.length-1;
    if(i>=0){
    while(j>=0&&arr[j]<=arr[i])
    {
        j--;
    }
    swap(arr,i,j);
}
 reverse(arr,i+1,arr.length-1);
    }
public static void swap(int[] arr,int i,int j)
{
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
public static void reverse(int[] arr,int j,int k){
while(j<k)
{
swap(arr,j,k);
j++;
k--;
}
}
public static void main(String[] args) {
    int[] arr={2,3,6,5,4,1};
    nextPer(arr);
System.out.println(Arrays.toString(arr));
}
}