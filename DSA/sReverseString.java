public class sReverseString {
    public static void main(String[] args) {
        String str="virat";
       char[] ch= str.toCharArray();
      int left=0;
      int right=str.length()-1;
      while(left<right)
      {
        char temp=ch[left];
ch[left]=ch[right];
ch[right]=temp;
left++;
right--;
      }
     String str1= new String(ch);
     System.out.println(str1);
       
    }
}
