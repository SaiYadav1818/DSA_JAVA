class bs2{
    public static int bs(int[] arr,int target,int start,int end){
int mid;
    while(start<=end)
    {
        mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
       else if(arr[mid]>target)
        {
        end=mid-1;
        }
        else if(arr[mid]<target){
            start=mid+1;
        }
       }
        return end; //float of a number is same but return end
    }}
public class BSceiling {
public static void main(String[] args) {
    int[] arr={4,5,6,7,8,9,11};
    int target=10;
    int start=0,end=arr.length-1;
System.out.println(bs2.bs(arr,target,start,end));
}   
}
