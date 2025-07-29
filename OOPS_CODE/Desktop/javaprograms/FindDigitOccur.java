public class FindDigitOccur {
 public static void main(String[] args) {
    String str="1237991191";
    int n=1;
    int count=0;
for(int i=0;i<str.length();i++)
{
    char c=str.charAt(i);
if(n==Character.getNumericValue(c)){
        count++;
    }
  }
  System.out.println(count);

}

 }   

