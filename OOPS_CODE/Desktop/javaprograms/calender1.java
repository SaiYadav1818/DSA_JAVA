import java.util.*;

public class calender1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();  
        System.out.println(cal.get(Calendar.YEAR));  
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); 
        System.out.println(cal.get(Calendar.MONTH)); 
    int max=cal.getActualMaximum(Calendar.MONTH);
    int min1 =cal.getActualMinimum(Calendar.MONTH);
    int min =cal.getActualMinimum(Calendar.DATE);
    System.out.println(max);
    System.out.println(min);
    System.out.println(min1);
    }
}
