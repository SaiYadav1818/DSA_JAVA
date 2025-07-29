/*public class subsequence {
    public static void main(String[] args) {
        String str="abc";
        fun("",str);
    }
   public static void fun(String p,String str){
if(str.isEmpty()){
    System.out.println(p);
    return;
}
char c=str.charAt(0);
fun(p+c,str.substring(1));
fun(p,str.substring(1));
    }
}
*/

import java.util.*;

public class subsequence {

    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
int[] arr={1,2,3};
int n=arr.length;
        genSubSeq(0,list,current,arr,n);
        for(List<Integer> l:list){
            System.out.print(l+" ");
        }
    }
    public static void genSubSeq(int idx,List<List<Integer>> list,List<Integer> curr,int[] arr,int n){
        if(idx>=arr.length){
list.add(new ArrayList<>(curr));
return;
        }
        curr.add(arr[idx]);
        genSubSeq(idx+1, list, curr, arr,n);
        curr.remove(curr.size()-1);
        genSubSeq(idx+1, list, curr, arr,n);

    }

}
