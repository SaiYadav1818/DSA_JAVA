import java.util.Scanner;

class NoVowelsException extends Exception {
  public NoVowelsException(String message) {
    super(message);
  }
}

public class Exception1 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      try {
        String text = input.nextLine();

        System.out.println("Original string: " + text);
        checkVowels(text);
        System.out.print("String contains vowels.");
      } catch (NoVowelsException e) {
        System.out.print("Error: " + e.getMessage());
      }
    }
public static void checkVowels(String str) throws NoVowelsException
{
    boolean found=false;
    for(int i=0;i<str.length();i++)
  {
    char ch=str.charAt(i);
      if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
found=true;
break;
      }
if(!found)
{
    throw new NoVowelsException(" String does not contain any vowels.");
}
    }
  }

}