import java.util.*;
public class Panagram {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog";
        HashSet<Character> unique=new HashSet<>();
String str1=str.toLowerCase();
char[] c1=str1.toCharArray();
for(char c:c1)
{
    if(c>='a'&&c<='z')
    {
unique.add(c);
    }
}
if(unique.size()==26)
{
System.out.print("panagram");
}
else{
    System.out.print("not panagram");
}

    }
}
