import java.io.*;
import java.util.*;

public class StrongPassword {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
  String str=sc.next();
   int d=0,l=0,u=0,s=0;
for(int i=0;i<str.length();i++)
{
    if(Character.isDigit(str.charAt(i)))
    {
        d++;
    }
    else if(Character.isUpperCase((str.charAt(i))))
    {
        u++;
    }
    else if(Character.isLowerCase(str.charAt(i)))
    {
        l++;
    }
    else {
        s++;
    }
}
int mis=0;
if(d==0)
{
mis++;
}
if(l==0)
{
    mis++;
}
if(u==0)
{
    mis++;
}
if(s==0)
{
    mis++;
}

System.out.print(Math.max(mis,6-(d+u+l+s)));
    }
}
/*
 SpecialCharacters.contains(String.valueOf(ch));
 */