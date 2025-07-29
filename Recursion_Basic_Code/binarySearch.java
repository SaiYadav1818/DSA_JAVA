public class binarySearch {
    //unnecesssary mid nad n parameters
    public static void main(String[] args) {
        int[] arr={1,2,22,43};
            int s=0;
        int e=arr.length-1;
        int m=0;
        if(isFound(arr,arr.length,23,m,s,e)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static boolean isFound(int[] a,int n,int target,int mid,int start,int end){
        mid=start+(end-start)/2;
        if(start>end){
            return false;
        }
        if(a[mid]==target){
            return true;
        }
        if(a[mid]>target){
return isFound(a, n, target,mid,start,mid-1);
}
else {
    return isFound(a, n, target, mid, mid+1, end);
}
    }
}
