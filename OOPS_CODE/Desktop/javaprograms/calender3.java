
public class calender3 {
    public static void main(String[] args) {
        int year;
        java.util.Calendar current;
        current=java.util.Calendar.getInstance();
        year = current.get( java.util.Calendar.YEAR);
System.out.println("Current Year: "+year);
    }
}
