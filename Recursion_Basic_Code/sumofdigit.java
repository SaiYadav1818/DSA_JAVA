public class sumofdigit {
    public static void main(String[] args) {
int n=1223;

        int res=fun(n);
        System.out.println(res);
    }
    public static int fun(int n){
        if(n==0){
            return 0;
        }
        return n%10+fun(n/10);
    }
}
