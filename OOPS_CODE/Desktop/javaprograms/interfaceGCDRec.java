import java.util.Scanner;

interface GCD {
    public int findGCD(int n1,int n2);
}
//Create a class B, which implements the interface GCD
class B implements GCD{

    public int findGCD(int n3,int n4)
    {
        if (n3 > n4) {
            return findGCD(n4, n3);
        }
        // Base cases
        if (n3 == 0) {
            return n4; // GCD of (0, n4) is n4
        }
        if(n3<0||n4<0)
        {
            return 1;
        }
        if (n3 == 1) {
            return 1; // GCD of (1, n4) is 1
        }
        if (n3 == n4) {
            return n3; // GCD of (n3, n3) is n3
        }
        // Recursive case: GCD(n3, n4) = GCD(n3, n4 % n3)
        return findGCD(n3, n4 % n3);
    }
  }

  public class interfaceGCDRec{ 
    public static void main (String[] args){ 
      B a = new B();   //Create an object of class B
        // Read two numbers from the keyboard
        Scanner sc = new Scanner(System.in);  
        int p1 = sc.nextInt();
       int p2 = sc.nextInt();
        System.out.print(a.findGCD(p1,p2)); 
} 
}