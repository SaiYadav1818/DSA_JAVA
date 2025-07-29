public class skipChar {
    public static void main(String[] args) {
        String str="baaacd";
        String str2="";
       String s= skip(str,str2);
       System.out.println(s);
    }
public static String skip(String str1,String str2){
if(str1.isEmpty()){
return str2;
}
if(str1.charAt(0)=='a'){
return skip(str1.substring(1),str2);
}
return skip(str1.substring(1),str2+str1.charAt(0));
}
}
