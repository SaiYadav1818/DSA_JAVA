/*example virat .it should be display like that irat at (starting letters start with vowel)*/
import java.util.*;
class vowel {
    public static void main(String ar[]){
        String v = "aeiouAEIOU";
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
for(int i=0;i<s.length();i++)
{
    char c = s.charAt(i);
   /* System.out.println(c);*//*
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')*/
for(int k=0;k<v.length();k++)
{
char cha = v.charAt(k);
if(cha==c)
{
for(int j=i;j<s.length();j++)
{
    char ch = s.charAt(j);
    System.out.print(ch);
}}}
System.out.print(" ");
}
    }
}