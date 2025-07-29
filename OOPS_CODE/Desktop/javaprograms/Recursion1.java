class a{
 int   gcd(int m,int n)
    {
        if(n>m)
        {

            return gcd(n,m);
        }
        else if(n==0){
return m;
        }
        else if(m==1)
        {
            return 1;
        }
        else if(m==n)
        {
            return m;
        }
        else{
            return gcd(m%n,n);
        }
    }
} class Recursion1 {
    public static void main(String[] args) {
       a obj=new a();
      System.out.println( obj.gcd(12,24));
    }
    
}





