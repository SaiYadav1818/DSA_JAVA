/*public class palindrome {
    public static void main(String[] args) {
        int num=122;
        int digit=(int)(Math.log10(num))+1;
        if(isPalindrome(num,digit)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static boolean isPalindrome(int n,int digit){
        if(digit<=1){
            return true;
        }
        int f=n/(int)Math.pow(10,digit-1);
        int s=n%10;
        if(f!=s){
            return false;
        }
        return isPalindrome(n/10, digit-2);
    }
}*/
public class palindrome {

     public static void main(String[] args) {
        String str="madam";
        int n=str.length();
        char[] c=str.toCharArray();
       System.out.print( palindrome1(c,0,str.length()-1,n));
     }

     public static boolean palindrome1(char[] c ,int f,int e,int n){
if(e>=n/2){
    return true;
}
if(c[f]!=c[e]){
    return false;
}
return palindrome1(c, f+1, e-1, n);
     }
    }
  

