import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class collection3 {
    public static void main(String[] args) {
        List<Integer> hd=new ArrayList<Integer>();
        ArrayList<Integer> fre=new ArrayList<Integer>();
hd.add(1);
hd.add(2);
hd.add(2);
hd.add(3);
hd.add(1);
hd.add(2);
int max=Collections.max(hd);
int a=Collections.frequency(hd, max);
System.out.println(a);

        /*if((year<=1917&&year%4==0)||(year>1918 &&(year%400==0 || (year%4==0&&year%100!=0)))){
return "12.09."+year;

}
else if(year==1918)
{
    return "26.09.1918";
}
else {
    return "13.09."+year;
}
} */
    }
}
