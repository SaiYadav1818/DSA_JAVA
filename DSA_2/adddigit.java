import java.util.Scanner;
class adddigit{
    public static void main(String args[]){
        int n,i,sum=0;
        System.out.println("enter a number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        String numstring=Integer.toString(n);
        for(i=0;i<numstring.length();i++)
        {
            char ch=numstring.charAt(i);
            int digit=Character.getNumericValue(ch);
            sum=sum+digit;
        }
        System.out.println(sum);
    }
}