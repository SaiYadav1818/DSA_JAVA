public class subAscii {
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
fun(p+(c+0),str.substring(1));
   }
}

