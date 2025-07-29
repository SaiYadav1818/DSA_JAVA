import java.util.ArrayList;

public class permutation {

    public static void main(String aref[]){
        String str="ba";
        ArrayList<String> list=new ArrayList<>();
        permutationFun(" ",str,list);
        System.out.println(list);
    }
  public static void   permutationFun(String p,String str,ArrayList<String> list){
if(str.isEmpty()){
    list.add(p);
    return;
}

for(int i=0;i<str.length();i++){
    String f=str.substring(0,i);
    String s=str.substring(i+1);
    char c=str.charAt(i);
    permutationFun(p+c, f+s, list);
}
    }
}