import java.util.Scanner;
public class scan {
    public static void main(String[] args) {
        float b;
        long c;
        short e;
        double d;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s=sc.next();
        System.out.println(a);
        b=sc.nextFloat();
        System.out.println(b);
        System.out.println(s);
        c=sc.nextLong();
        e=sc.nextShort();
        d=sc.nextDouble();
        System.out.println(c);
        System.out.println(e);
        System.out.println(d);
    }

}