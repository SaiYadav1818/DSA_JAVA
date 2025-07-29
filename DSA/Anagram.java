import java.io.*;
import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   String str1=sc.nextLine();
   Map<Character,Integer> map=new HashMap<>();
   Map<Character,Integer> map1=new HashMap<>();
   char[] c1 =str.toCharArray();
   char[] c2 =str1.toCharArray();
   if(c1.length!=c2.length)
   {
    System.out.print("FALSE");
    return ;
   }
   else{
    for(int i=0;i<c1.length;i++)
    {
        map.put(c1[i],map.getOrDefault(c1[i],0)+1);
        map1.put(c2[i],map1.getOrDefault(c2[i],0)+1);
    }
    for(Map.Entry<Character,Integer> map2:map.entrySet())
    {
        if(!map1.containsKey(map2.getKey()))
        {
            System.out.print("FALSE");
            return ;}
            else{

            if(!map1.get(map2.getKey()).equals(map2.getValue()))
            {
                System.out.print("FALSE");
               return ;
            }}
        }
         
    }
    
    System.out.print("TRUE");

    }

    }
