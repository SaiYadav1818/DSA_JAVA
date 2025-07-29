public class vowel1 {
    public static void main(String[] args) {
        String str="aeiouAEIOU";
        int count=0;
      String str1="Hello";
     for(char c:str.toCharArray())
     {
if(str1.indexOf(c)!=-1)
{
    count++;
}
     }
     System.out.println(count);
    }
}
