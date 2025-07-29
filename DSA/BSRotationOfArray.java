//finding peak element
//if it is even duplicate in rotated array it works
//first it checks the right side

class bs4{
    public static int bs(int[] arr,int t,int s,int e)
{
    while(s<=e)
    {
        int m=s+(e-s)/2;
        if(arr[m]==t)
        {
            return m;
        }
        else if(arr[m]>t)
        {
            e=m-1;
        }
        else{
            s=m+1;
        }
    }
    return -1;
}
}
public class BSRotationOfArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,5,5,1,3,7};
        int target=3;
      int s=0;
      int e=arr.length-1;
    int p=pivot(arr);
    System.out.println(p);
      int result;
      if(p==-1)
      {
     result=bs4.bs(arr,target,0,e);
      
      }
    else{
     if(arr[p]==target)
     {
        result=p;
     }
     else{
     result = bs4.bs(arr, target, p + 1, e);

        // If not found, check the left side
        if (result == -1) {
            result = bs4.bs(arr, target, s, p);
        }}
    }
    if (result != -1) {
        System.out.println("Element found at index: " + result);
    } else {
        System.out.println("Element not found.");
    }
    }

        public static int findPivot(int[] arr) {
            int s = 0;
            int e = arr.length - 1;
    
            while (s <= e) {
                int m = s + (e - s) / 2;
    
                // Case 1: Found the pivot point
                if (m < e && arr[m] > arr[m + 1]) {
                    return m + 1;
                }
                if (m > s && arr[m] < arr[m - 1]) {
                    return m;
                }
    
                // Case 2: Handling duplicates (Move s and e to reduce search space)
                if (arr[s] == arr[m] && arr[m] == arr[e]) {
                    if (s < e && arr[s] > arr[s + 1]) return s + 1;
                    s++;
                    if (e > s && arr[e] < arr[e - 1]) return e;
                    e--;
                }
                
    
                // Case 3: Left half is sorted, pivot must be in the right half
                else if (arr[s] <= arr[m]) {
                    s = m + 1;
                } 
                // Case 4: Right half is sorted, pivot must be in the left half
                else {
                    e = m - 1;
                }
            }
            return -1;  // If no pivot is found, the array is not rotated.
        }
}
