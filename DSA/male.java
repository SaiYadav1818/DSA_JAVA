import java.io.*;
import java.util.*;

public class male {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
   Scanner sc=new Scanner(System.in);
   String str=sc.next();
   ArrayList<Character> list=new ArrayList<>();
   for(int i=0;i<str.length();i++){
    if(!list.contains(str.charAt(i))){
list.add(str.charAt(i));
}
   }
   if(str.length()==list.size()){
    System.out.println("CHAT WITH HER!");
   }
   else{
    System.out.println("IGNORE HIM!");
   }
    }
}