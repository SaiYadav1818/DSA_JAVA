public class BSFirstAndLastPositonArray{
    public static void main(String arf[]) {
        int[] arr={5,7,7,8,8,10};
        int t=8;
     int s=bs(arr,t,true)  ; 
     int e=bs(arr,t,false);
   System.out.println(s+" "+e);
    }
 static  int bs(int[] arr,int t,boolean first)
{
    int ans=-1;
   int s=0;
   int e=arr.length-1;
   while(s<=e)
   {
    int m=s+(e-s)/2;
    if(arr[m]==t)
    {
if(first)
{
    ans=m;
    e=m-1;
}
else{
    ans=m;
    s=m+1;
}
    }
    else if(arr[m]>t)
    {
        e=m-1;
    }
    else{
        s=m+1;
    }
   }
   return ans;
}

}
