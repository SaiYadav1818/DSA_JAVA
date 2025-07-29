class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] str=new String[strs.length];
List<List<String>> list1=new ArrayList<>();
     
        boolean[] visited=new boolean[str.length];
       for(int i=0;i<strs.length;i++)
       {
        char[] c=strs[i].toCharArray();
        Arrays.sort(c);
       String str1=new String(c);
     str[i]=str1;
     }
     for(int i=0;i<str.length;i++)
     {
   if(visited[i]){
    continue;
   }
      List<String> list=new ArrayList<>();
        list.add(strs[i]);
        int j=i+1;
while(j<str.length){
        if(!visited[j] && str[i].equals(str[j]))
        {
list.add(strs[j]);
visited[j]=true;
j++;
        }
        else{
            j++;
        }
        }
        list1.add(list);
   
     }
   
    return list1;
    }
}
/*class Solution {
    public List<String> removeAnagrams(String[] words) {
String pev=" ";
           List<String> list=new ArrayList<>();
      String[] str=new String[words.length];

      boolean[] visited=new boolean[str.length];
      for(int i=0;i<words.length;i++)
      {
        char[] c=words[i].toCharArray();
        Arrays.sort(c);
        String str1=new String(c);
     if(!str1.equals(pev))
     {
        list.add(words[i]);
        pev=str1;
     }


      }  
   
return list;
}

} */