import java.util.*;
public class MapCountFreChar {
    public static void main(String[] args) {
        String str="saiyadav";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);

        }
        System.out.println(map);
       int max=Integer.MIN_VALUE;
for(int val:map.values())
{
    if(max<val)
    {
        max=val;
        
    }
}
System.out.println(max);
for(Map.Entry<Character, Integer> entry:map.entrySet())
{
    if(entry.getValue()==max)
    {
        System.out.println(entry.getKey());
    }
}
    }
}
