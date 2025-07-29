import java.util.*;
class top{
 
    boolean fun(int n) {
        // Initialize a set to detect cycles
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = happy(n);
        }
        return n ==1;
    }
int happy(int n1){
      int sum=0;
    while(n1!=0)
    {
      
    int r=n1%10;
    n1=n1/10;
    int sq=r*r;
    sum+=sq;
    }
return sum;
}
}


public class HappyNumber {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       top obj=new top();  
       if(obj.fun(n))
       {
        System.out.println("happy");
       }
       else
       {
        System.out.println("not happy");
       }
    }
}

