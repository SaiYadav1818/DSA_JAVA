import java.util.*;
abstract class Calender {
    abstract void getDay(int m,int d,int y);
}
 class subclass extends Calender {
    String[] week = {"Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday", "Monday"};
        String[] one = new String[32];
 subclass(){
     for(int i=1;i<32;i++)
     {
       one[i]=week[(i-1) % week.length];  
     }
 }
 void getDay(int m ,int d,int y)
 {
     System.out.println(one[d]);
 }}
public class OneMonthAbstract {
        public static void main(String[] args)  {
             Scanner sc =new Scanner(System.in);
             String input = sc.nextLine();
            String[] parts = input.split("\\s+");
            int m=Integer.parseInt(parts[0]);
             int d = Integer.parseInt(parts[1]);
          int y = Integer.parseInt(parts[2]);
          subclass obj = new subclass();
          obj.getDay(m,d,y);
         }
     }
     

