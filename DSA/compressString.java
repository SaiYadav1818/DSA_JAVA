import java.io.*;
import java.util.*;

public class compressString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    List<String> list=new ArrayList<>();
    StringBuffer sb=new StringBuffer();
    int count=0;
    int i=0;
    while(i<str.length())
    {
        while(str.charAt(i+count)==str.charAt(i))
        {
            count++;
        }
        String c=String.valueOf(count);
list.add(c);
        i=count;
    }
    int j=0;
for(int k=0;k<list.size();k++)
{
    sb.append(str.charAt(j));
    sb.append(list.get(k));
    int add=Integer.parseInt(list.get(k));
    j=add+1;
}
String str3=sb.toString();
System.out.print(str3);
    }
}