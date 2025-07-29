import java.util.Scanner;
class chars {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int i;
        String a =sc.next();
        System.out.println("the string num is"+a);
        for(i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            int s=Character.getNumericValue(ch);
            System.out.println(s);
        }

    }
}