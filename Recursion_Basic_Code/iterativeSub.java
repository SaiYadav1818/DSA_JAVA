import java.util.ArrayList;
import java.util.List;

public class iterativeSub {
    public static void main(String[] args) {
        int[] arr={1,2,3};
    List<List<Integer>> list= sub(arr);
for(List<Integer> list1:list){
System.out.println(list1);
}
    }
    static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
int n=outer.size();
for(int i=0;i<n;i++){
  
        List<Integer> internal=new ArrayList<>(outer.get(i));
    
    internal.add(num);
    outer.add(internal);
}
        }
    
    return outer;
}
}