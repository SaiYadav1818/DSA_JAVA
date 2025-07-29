import java.util.*;
import java.text.SimpleDateFormat;

class result {
    // Method to return the date in "dd MM yyyy" format as a string
    public static String cale(int d, int m, int y) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, m - 1);  // Set the month (0-based index)
        cal.set(Calendar.DAY_OF_MONTH, d);  // Set the day
        cal.set(Calendar.YEAR, y);  // Set the year
        
        // Define the desired date format
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
        // Convert the Calendar date to the desired string format
        return sdf.format(cal.getTime());
    }
}
public class calenderHack3 {
    public static void main(String[] args) {
        // Print the date in the desired format
        System.out.println(result.cale(12, 10, 2024));
    }
}
