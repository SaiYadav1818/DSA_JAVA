import java.text.SimpleDateFormat;
import java.util.*;
public class CalenderHack4 {
    public static void main(String[] args) {
      GregorianCalendar cal = new GregorianCalendar();
cal.set(Calendar.MONTH,9);
cal.set(Calendar.DAY_OF_MONTH,12);
cal.set(Calendar.YEAR,2024);
int num=cal.get(Calendar.YEAR);
System.out.println(cal.isLeapYear(num));
System.out.println(cal.getTime());
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
String date=sdf.format(cal.getTime());
System.out.println(date);
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