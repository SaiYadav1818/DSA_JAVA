import java.util.HashMap;
import java.util.Map;
public class MapCountWords {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        String str="sai yadav is learn java from sai self class";
        String[] words= str.split("\\s+");

        for(String str1:words){
map.put(str1,map.getOrDefault(str1, 0)+1);
        }
int max=Integer.MIN_VALUE;
for(int num:map.values())
{
if(num>max)
{
    max=num;
}
}
System.out.println(max);
for(Map.Entry<String,Integer> entry:map.entrySet())
{
    if(entry.getValue()==max)
    {
        System.out.println(entry.getKey());
    }
}
    }
}
