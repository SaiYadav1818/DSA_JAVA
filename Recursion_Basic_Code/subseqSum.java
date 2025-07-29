import java.util.ArrayList;
import java.util.List;

public class subseqSum {
 public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
int[] arr={1,2,3};
int n=arr.length;
        genSubSeq(0,list,current,arr,n,0,3);
       /*  for(List<Integer> l:list){
            System.out.print(l+" ");
        }*/
    }
    public static void genSubSeq(int idx,List<List<Integer>> list,List<Integer> curr,int[] arr,int n,int sum,int tar){
        if(idx>=arr.length){
//list.add(new ArrayList<>(curr));
if(sum==tar){
    System.out.print(tar+" ");
}
return;
        }
        curr.add(arr[idx]);
        sum+=arr[idx];
        genSubSeq(idx+1, list, curr, arr,n,sum,tar);
        sum-=curr.get(curr.size()-1);
        curr.remove(curr.size()-1);
        genSubSeq(idx+1, list, curr, arr,n,sum,tar);

    }

}
