class abc 
{
  int b=20;
    int a;
    protected int m1(int x)
    {a=x;
        return a==x ? 1:0 ;
    }
}
class pqr extends abc
{
    public int m1( int x)  
    {
      a=x;
        return this.a==x?1:0 ;/*true:false */
    } 
} 
public class MethodOverriddingPoly {
    public static void main(String[] args) {
      pqr obj =new pqr();
     int result= obj.m1(20);  
     System.out.println(result);
    }
}
/*The method in SuperClass is protected, meaning it is accessible within the same package and subclasses.
The overridden method in SubClass is public, which is more accessible than protected. This is allowed.
*/