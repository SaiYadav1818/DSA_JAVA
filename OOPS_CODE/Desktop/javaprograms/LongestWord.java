import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        String str = scanner.nextLine();
        
      
        String[] words = str.split(" ");
        
    
        int[] lengths = new int[words.length];
   int max=0;String lw=" ";
       for(String word:words)
       {
        if(max<word.length())
        {
           max=word.length();
           lw=word;
        }
       }
      
  System.out.println(lw);
      
  
  
    }
}

