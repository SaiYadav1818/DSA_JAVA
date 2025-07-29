public class countZeros {
    public static void main(String[] args) {
        int num=102430;
        int c=0;
      System.out.println(count(num,c));  

    }
    public static int count(int n,int c){
        if(n==0){
            return c;
        }
        int digit=n%10;
        if(digit==0){
            return count(n/10, c+1);
        }
        else{
            return count(n/10, c);
        }
    }
}
