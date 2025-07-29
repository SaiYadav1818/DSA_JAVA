class bs3{
  public  static int peakEle(int[] arr,int target)
    {
        int start=0,end=arr.length-1;
while(start<end)
{
int mid=start+(end-start)/2;
if(arr[mid]<arr[mid+1])
{
    start=mid+1;
}
else{
    end=mid;
}
}
int peak=start;
int result = bs(arr, target, peak + 1, arr.length - 1, false);
if(result!=-1)
{
    return result;
}
return bs(arr, target, 0, peak, true);
    }
    public static int bs(int[] arr,int target,int start,int end,boolean ascending){
int mid;
    while(start<=end)
    {

        mid=start+(end-start)/2;
        if(ascending){
        if(arr[mid]>target)
        {
        end=mid-1;
        }
        else if(arr[mid]<target){
            start=mid+1;
        }
        else if(arr[mid]==target){
        return mid;
        
        }
    }
    else{
        if(arr[mid]>target)
        {
       start=mid+1;
        }
        else if(arr[mid]<target){
            end=mid-1;
        }
        else if(arr[mid]==target){
        return mid;  
    }
    }
     
    }
return -1;
}}
public class BSPeakElement{
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,3,1};
    int target=3;
    int result=bs3.peakEle(arr,target);
    System.out.println(result);
    
}   
}
