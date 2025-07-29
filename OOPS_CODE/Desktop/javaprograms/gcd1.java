class a{
 int gcd(int m,int n){
 while(n!=0){
int temp=n;
n=m%n;
m=temp;
 }
 return m;
}}
class gcd1 {
    public static void main(String[] args) {
        
    
    a obj = new a();
    System.out.print(obj.gcd(108,98));
}}
