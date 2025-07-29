import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringRotation {
 public static void main(String srs[])
 {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    Queue<Character> queue=new LinkedList<>();
    StringBuilder sb=new StringBuilder();
for(int i=0;i<str.length();i++){
queue.offer(str.charAt(i));
}
int n=2;
while(n!=0)
{
    char c=queue.poll();
    queue.offer(c);
    n--;
}
for(char ch:queue)
{
sb.append(ch);
}
String s=sb.toString();
System.out.println(s);
n=2;
System.out.println(str.substring(n)+str.substring(0,n));
/*  int n=str.length();
    i=i%n;  */
 }   
}
 