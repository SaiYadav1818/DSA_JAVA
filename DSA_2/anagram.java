import java.util.*;
class anagram {
    public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
String s1=sc.nextLine();
String s2 =sc.nextLine();
int x[]=new int[100];
int y[]=new int[100];
int z[]=new int[100];
int m=0;
for(int i=0;i<s1.length();i++)
{
    char c=s1.charAt(i);
    for(int j=0;j<s2.length();j++)
    {
    char ch=s2.charAt(j);
    if(ch==c)
    {
        System.out.print(ch);    }
}
}
}
}