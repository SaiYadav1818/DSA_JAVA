public class ButterFlyPattern {
    public static void main(String[] args) {
        int n=5;
        int b=5*2;
        for(int i=1;i<=5;i++)
        {
    
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         }
         for(int k=i+1;k<=b-i;k++)
         {
System.out.print(" ");
         }
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         }
System.out.println();
        }
for (int i = n; i >= 1; i--) {
    // Left wing
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    // Spaces in the middle
    for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
    }
    // Right wing
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

 }}
    

