import java.util.*;
class result {
public static String cale(int d,int m,int y)
{
Calendar cal=Calendar.getInstance();
cal.set(Calendar.MONTH,m-1);
cal.set(Calendar.DAY_OF_MONTH,d);
cal.set(Calendar.YEAR,y);
Date data =cal.getTime();
System.out.println(data);
String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
return dayOfWeek;
}
}
public class calenderHack {
 public static void main(String[] args) {
   System.out.println(result.cale(12,9,2024)); 

 }   
}
/*dd/MM/yyyy – 12/12/2024
yyyy-MM-dd – 2024-12-12
dd MMM yyyy – 12 Dec 2024
EEEE, MMMM d, yyyy – Thursday, December 12, 2024
hh:mm a – 01:30 PM
HH:mm:ss – 13:30:45
yyyy-MM-dd HH:mm:ss – 2024-12-12 13:30:45
EEE, d MMM yyyy HH:mm:ss Z – Thu, 12 Dec 2024 13:30:45 +0530
h:mm:ss a zzzz – 1:30:45 PM Pacific Standard Time */