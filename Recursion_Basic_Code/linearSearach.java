public class linearSearach {

    public static void main(String[] args) {
        int[]arr={12,321,14,53};
        int target=32;
   System.out.println(ls(arr,target,arr.length-1));
    
    }
    public static boolean ls(int[] arr,int t,int len){
        if(len<0){
            return false;
        }
       
        return arr[len]==t || ls(arr,t,len-1);
    }
}
/*public class linearSearach {

    public static void main(String[] args) {
        int[]arr={12,32,14,53};
        int target=32;
   int  res=ls(arr,target,arr.length-1);
    System.out.println(res);
    }
    public static int ls(int[] arr,int t,int len){
        if(len<0){
            return -1;
        }
        if(arr[len]==t){
            return len;
        }
        return ls(arr,t,len-1);
    }
}*/