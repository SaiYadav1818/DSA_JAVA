import java.util.Scanner;

public class LongestSubsequenceWithOutVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max1=Integer.MIN_VALUE;
        int count=0;
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||  str.charAt(i)=='i' ||  str.charAt(i)=='o' ||  str.charAt(i)=='u' )
            {
count=0;
            }
            else{
                count++;
            }
           max1= Math.max(max1,count);
        }
        System.out.println(max1);
    }
}
