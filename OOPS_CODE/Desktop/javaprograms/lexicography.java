public class lexicography{
public static void main(String[] args) {
String str1 = "a";
String str2 = "Apple";
int[] v=new int[100];
for(int i=0;i<str2.length();i++)
{
    char c=str2.charAt(i);
    int va=(int) c;
     v[i]=va;
}
for(int i=0;i<str2.length();i++)
{
    System.out.println(v[i]);
}
if (str1.compareTo(str2) < 0) {
    System.out.println(str1 + " is lexicographically smaller than " + str2);
} else if (str1.compareTo(str2) > 0) {
    System.out.println(str1 + " is lexicographically greater than " + str2);
} else {
    System.out.println(str1 + " is equal to " + str2);
}
}}
