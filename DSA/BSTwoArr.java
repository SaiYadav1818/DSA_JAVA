
public class BSTwoArr {

    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{15,25,35,45},{38,39,37,49},{33,34,38,50}};
       int[] res=search(arr,38);
       System.out.println(res[0]+" "+res[1]);
    }
 static int[] search(int[][] arr,int t)
    {
    int r=0;
    int c=arr.length-1;
    while(r<arr.length && c>=0)
    {
    if(arr[r][c]==t)
    {
        return new int[] {r,c};
    }
    else  if(arr[r][c]>t)
    {
        c--;
    }
    else if(arr[r][c]<t){
        r++;
    }
    }
    return new int[] {-1,-1};
    }
}