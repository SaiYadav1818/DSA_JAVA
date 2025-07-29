public class MaxNum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,10,7};
    int res=   maxclass.max(arr,1);
System.out.println(res);
    }
}
class maxclass{
    static int max(int[] arr,int res)
    {
        int maxs=arr[0];
        while(res!=arr.length){
if(arr[res]>maxs)
{
maxs=arr[res];
res++;
}
else
{
    res++;
}}
return maxs;
    }
}