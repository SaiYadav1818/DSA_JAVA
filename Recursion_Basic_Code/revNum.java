//same palindrome
public class revNum {

    public static void main(String[] args) {
        int num=123;
       
        int digit=(int)Math.log10(num)+1;
       System.out.println( rev(num,digit));
    }
    public static int rev(int n,int digit){
        if(n%10==n){
            return n;
        }
       int rev2=n%10;
        return rev2*(int)Math.pow(10,digit-1)+rev(n/10,digit-1);
    }
}
/*public class revNum {
    public static void main(String[] args) {
        int num=123;
        int rev1=0;
        rev(rev1,num);
System.out.println(rev(rev1,num));
    }
    public static int rev(int rev1,int n){
        if(n==0){
            return rev1;
        }
       rev1= rev1*10+n%10;
        return rev(rev1,n/10);
    }
}*/
