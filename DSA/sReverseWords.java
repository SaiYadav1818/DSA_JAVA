public class sReverseWords {
    public static void main(String[] args) {
        String str = "Hello world from ChatGPT";
        String[] words= str.trim().split("\\s+");//to remove spaces at the end and first
        int left=0;
        int right=words.length-1;
        while(left<right)
        {
            String temp=words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
        }
        String str1=String.join(" ", words);
        System.out.println(str1);
    }
}
