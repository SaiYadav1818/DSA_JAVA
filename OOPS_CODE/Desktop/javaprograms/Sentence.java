import java.util.*;
public class Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
   String[] words = str1.split("[\\s,.'!?]+");
   String[] name ={"hello","hi"};
   for(String word:words)
   {
    System.out.println(word);
   }
   System.out.println(words);
   for(int i=0;i<name.length;i++)
   {
    System.out.println(name[i]);
   }
    }
}
