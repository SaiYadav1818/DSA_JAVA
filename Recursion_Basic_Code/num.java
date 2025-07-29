public class num{
public static void main(String[] args) {
    int n=5;
    fun(n);
    System.out.println("rev fun");
    funrev(n);
    System.out.println("funboth");
    funboth(n);
}
public static void fun(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
fun(n-1);
}

public static void funrev(int n){
    if(n==0){
        return;
    }
 
funrev(n-1);
System.out.println(n);
}
public static void funboth(int n){
    if(n==0){
        return;
    }
 
System.out.println(n);
funboth(n-1);
System.out.println(n);
}
}