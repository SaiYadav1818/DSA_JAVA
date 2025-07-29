    class bs1{
        public static int bs(int[] arr,int target,int start,int end){
    int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]>target)
            {
            end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]==target){
            return mid;
            }}
            return -1;
        }}
    public class BS {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,3};
        int target=9;
        int start=0,end=arr.length-1;
    System.out.println(bs1.bs(arr,target,start,end));
    }   
    }
