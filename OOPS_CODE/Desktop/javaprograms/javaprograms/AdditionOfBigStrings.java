import java.math.BigInteger;
public class AdditionOfBigStrings{
    public static void main(String[] args) {
        
    String num1="1232434342423123";
    String num2="2424523524132434";
       BigInteger nu1 = new BigInteger(num1);
        BigInteger nu2 = new BigInteger(num2);

        // Correct addition
        BigInteger sum = nu1.add(nu2);

        System.out.println(sum.toString());
   
    }
}
