public class skipString {
    public static void main(String[] args) {
        String str="abcapplehello";
      System.out.println(skip(str));  
    }
    public static String skip(String str1){
        if(str1.isEmpty()){
        return "";
        }
        if(str1.startsWith("apple")){
        return skip(str1.substring(5));
        }
        return str1.charAt(0)+skip(str1.substring(1));
        }
}
