public class SubString {

    public static void main(String[] args) {
        String str ="abcdeabck";
        String str1="deab";
        int l=str1.length();
        boolean found=false;
        String str2="";
for(int i=0;i<=str.length()-l;i++)
{
str2=str.substring(i, i+l);
if(str2.equals(str1))
{
  found=true;
  break;
}
}
System.out.println(found);
    }
}