public class SlidingWindowKandaneAlog {
    public static void main(String[] args) {
   
        
                int[] arr={2,3,4,2,1,2,35,65};
             
              int max1=arr[0];
              int max2=arr[0];
              
              for(int i=1;i<arr.length;i++)
              {
                 max1=Math.max(arr[i],max1+arr[i]);
                 max2=Math.max(max1,max2);
              }
           System.out.println(max2);
    }
}
