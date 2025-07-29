import java.util.*;
class result {
public static Date cale(int d,int m,int y)
{
Calendar cal=Calendar.getInstance();
cal.set(Calendar.MONTH,m-1);
cal.set(Calendar.DAY_OF_MONTH,d);
cal.set(Calendar.YEAR,y);
Date data =cal.getTime();
return data;

}
}
public class calenderHack2 {
 public static void main(String[] args) {
   System.out.println(result.cale(12,9,2024)); 

 }   
}