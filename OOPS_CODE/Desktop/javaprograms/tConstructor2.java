class method {
    String str;
    int n;
    char c;
    float fee;
 method(String str ,int n,char  c)
{
    this.str=str;
    this.n=n;
    this.c=c;
}
method(String str ,int n,char c,float fee)
{
   this(str,n,c);/*reusebility */
   this.fee=fee;
}
void  call()
{
    System.out.println(str+n+c);
    System.out.println(str+n+c+fee);
}
}
public class tConstructor2 {
    public static void main(String[] args) {
        method obj = new method("pavan kumar", 18,'a');
        method obj1 = new method("vk", 1818,'a',4);
        obj.call();
        obj1.call();
    } 
}
