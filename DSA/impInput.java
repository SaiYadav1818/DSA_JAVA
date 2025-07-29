
import java.util.*;
public class impInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String[] line1=str1.split(",");
        String[] line2=str2.split(",");
    
       String str="";
       String str3="";
       for(int i=line1.length-1;i>=0;i--){
        str+=line1[i];
       }
       for(int i=line2.length-1;i>=0;i--){
str3+=line2[i];
       }
    int n1=Integer.parseInt(str3);
    int n2=Integer.parseInt(str);
    int n3=n1+n2;
    String ans=String.valueOf(n3);
    StringBuilder sb=new StringBuilder(ans);
    sb.reverse();
    String res=sb.toString();

    String result = String.join(",", res.split(""));
    System.out.println(result);
    }
}
/*import java.util.*;

public class impInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input strings
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        // Remove commas and reverse the strings
        String num1 = new StringBuilder(str1.replace(",", "")).reverse().toString();
        String num2 = new StringBuilder(str2.replace(",", "")).reverse().toString();
        
        // Convert to integers and sum them up
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = n1 + n2;
        
        // Reverse the sum and format it with commas
        String reversedSum = new StringBuilder(String.valueOf(sum)).reverse().toString();
        String result = String.join(",", reversedSum.split(""));

        System.out.println(result);
        
        sc.close();
    }
}
 */