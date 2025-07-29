/*import java.util.Locale;

public class calender2 {
    public static void main(String[] args) {
        Locale[] la=    Locale.getAvailableLocales();
        for(Locale l:la)
        {
            System.out.println(l);
        }
    }
}*/
import java.util.Calendar;

public class calender2 {
    public static void main(String[] args) {
        // Get the user's calendar instance (based on system's locale and time zone)
        Calendar userCalendar = Calendar.getInstance();

        // Retrieve information from the calendar
        int year = userCalendar.get(Calendar.YEAR);
        int month = userCalendar.get(Calendar.MONTH);  // Note: January is 0, December is 11
        int day = userCalendar.get(Calendar.DAY_OF_MONTH);
        int hour = userCalendar.get(Calendar.HOUR_OF_DAY);  // 24-hour format
        int minute = userCalendar.get(Calendar.MINUTE);
        int second = userCalendar.get(Calendar.SECOND);

        // Print the calendar details
        System.out.println("User's Calendar:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1));  // Adding 1 because months are 0-based
        System.out.println("Day: " + day);
        System.out.println("Time: " + hour + ":" + minute + ":" + second);
  int dayweek=userCalendar.get(Calendar.DAY_OF_WEEK);
  System.out.println(dayweek);
  System.out.println(Calendar.SUNDAY);
  System.out.println(Calendar.MONDAY);
    }
}

