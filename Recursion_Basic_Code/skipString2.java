public class skipString2 {
    public static void main(String[] args) {
        String str="abdcappappleg";
        System.out.println(skip(str));
    }
    public static String skip(String str){
if(str.isEmpty()){
    return "";
}
if(str.startsWith("app") && !str.startsWith("apple")){
    return skip(str.substring(3));
}
return str.charAt(0)+skip(str.substring(1));
    }
}
