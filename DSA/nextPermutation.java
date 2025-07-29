import java.util.Arrays;

public class nextPermutation {
    public static void main(String afd[]){
        int[] arr={2,1,5,4,3,0};
        int n=arr.length;
        int i=n-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        int j=n-1;
        if(i>=0){
          while(j>=0 && arr[i]>=arr[j]){
            j--;
          }
         if(j>=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
         }
        }
        rev(arr,i+1,n-1);
System.out.println(Arrays.toString(arr));

    }
    public static void rev(int[] arr,int i,int n){
while(i<n){
    int temp=arr[i];
    arr[i]=arr[n];
    arr[n]=temp;
    i++;
    n--;
}
    }
}
