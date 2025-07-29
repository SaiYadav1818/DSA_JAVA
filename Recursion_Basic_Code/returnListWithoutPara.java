import java.util.ArrayList;

public class returnListWithoutPara {

    public static void main(String[] args) {
        int[] arr={23,32,12,32,34};
        int target=32;
       ArrayList<Integer> list=linearSearach(arr,target,0);
       System.out.println(list);
    }
public static ArrayList<Integer> linearSearach(int[] arr,int t,int index){
    ArrayList<Integer> list=new ArrayList<>();
    if(arr.length==index){
        return list;
    }
    if(arr[index]==t){
        list.add(index);
    }
    ArrayList<Integer> ansBelowcalls=linearSearach(arr, t,index+1);
    list.addAll(ansBelowcalls);
    return list;
}
}