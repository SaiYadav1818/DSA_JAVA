import java.util.*;
public class lexicography1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
       boolean con;
        int strl=str.length();
        int str1l=str1.length();
        int[] ascii = new int[100];
        int[] asciii = new int[100];

        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            int v=(int) c;
            ascii[i]=v;
        }
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            int va=(int) ch;
            asciii[i]=va;
        }
         if(strl>=str1l)
         {
for(int i=0;i<strl;i++)
{
    if(ascii[i]>asciii[i])
    {
System.out.println("str1 is greater than str2");
break;
    }
    else if(ascii[i]==asciii[i])
    {
        if(i==strl-1){
            System.out.println("str2 are eqaul str1"); 
            }
       
    }
    else
    {
        System.out.println("str2 is greater than str1");
        break; 
    }
}
         }  
         else {
            for(int i=0;i<str1l;i++){
 if(ascii[i]>asciii[i])
 {
    System.out.println("str1 is greater than str2"); 
    break;
 }
 else
 {
    System.out.println("str2 is greater than str1");
    break;   
 }
}
        }


        
    }
    
}
