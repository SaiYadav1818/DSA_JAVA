public class Arrayssort {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5};
        if(isArraySort(arr,arr.length)){
            System.out.println("Arrray is sort");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    public static boolean isArraySort(int[] arr,int n){
if(n<=1){
    return true;
}
        
       return (arr[n-1]>=arr[n-2]) && isArraySort(arr, n-1);
    
   }
}
