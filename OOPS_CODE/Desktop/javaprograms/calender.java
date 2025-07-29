
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;
import java.util.TimeZone;
public class calender
 {
 
    public static void main(String[] args) {
        Locale loc=Locale.US;
        System.out.println(loc);
        TimeZone tz=TimeZone.getDefault();
        System.out.println(tz.getDisplayName());
        Calendar cal=Calendar.getInstance(tz);
        Date data =cal.getTime();
        System.out.println(data);
    }
}
