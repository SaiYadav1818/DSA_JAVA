import java.util.*;
class result {
public static String  cale(int d,int m,int y)
{
Calendar cal=Calendar.getInstance();
cal.set(Calendar.MONTH,m-1);
cal.set(Calendar.DAY_OF_MONTH,d);
cal.set(Calendar.YEAR,y);
int a=cal.get(Calendar.DAY_OF_WEEK);
String roju="";
switch (a) {
    case Calendar.SUNDAY:
        roju="SUNDAY";
        break;
case 2:
roju="MONDAY";
break;
case 3:
roju="TUESDAY";
break;
case 4:
roju="WEDDAY";
break;
case 5:
roju="THRUSDAY";
break;
case 6:
roju="FRIDAY";
break;
case 7:
roju="SATURDAY";
break;
    default:
    roju="NO DAY";
        break;
}
return roju;
}
}
public class calenderHack1{
 public static void main(String[] args) {
   System.out.println(result.cale(12,10,2024)); 
 }   
}
