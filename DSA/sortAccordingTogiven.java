import java.util.*;

public class sortAccordingTogiven {
    public static void main(String ar[])
    {
        String str="#@*&";
        int k=0;
    /* 
        List<Character> list =new ArrayList<>();*/
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new TreeMap<>();
        map.put('!', 1);
        map.put('@', 2);
        map.put('#', 3);
        map.put('$', 4);
        map.put('%', 5);
        map.put('^', 6);
        map.put('&', 7);
        map.put('*', 8);
        char[] c1=str.toCharArray();
        char[] c2 =new char[c1.length];
       /*for(int i=0;i<c1.length;i++)
       {
list.add(c1[i]);
       }*/
       for(int i=0;i<c1.length;i++)
       {
        if(map.containsKey(c1[i]))
        {
map1.put(c1[i],map.get(c1[i]));
        }
       } /*list.sort(Comparator.comparingInt(c -> map.getOrDefault(c, Integer.MAX_VALUE))); */
       

     /* Collections.sort(list);*/  

for(Map.Entry<Character,Integer> entry :map1.entrySet())
{
c2[k++]=entry.getKey();
}/* 
for(char c:list)
{
    c1[k++]=c;
} */String str1=String.valueOf(c2);

System.out.println(str1);
    }
}
