// for all digit number of armstrong
import java.util.Scanner;
class armstrong2 {
                                                                                                                                                        public static void main(String args[]){
        int n,i,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        String numstring=Integer.toString(n);
        for(i=0;i<numstring.length();i++)
        {
            char ch=numstring.charAt(i);//we need char object
            int digit=Character.getNumericValue(ch);//This is a static method in the 
            //Character class in Java. It takes a character ch as input and returns 
            //its numeric value. 
            //If the character represents a digit (0-9), it returns the corresponding 
            //integer value. 
          //int digit= Character.getNumericValue(numstring.charAt(i));

          sum+=Math.pow(digit,numstring.length());
        }
        System.out.println(sum);
        if(sum==n)
        {
            System.out.println("armstrong");
        }
        else{
            System.out.println("not a armstrong");
        }
    }
}