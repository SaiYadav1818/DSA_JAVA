import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
set.add(2);
set.add(3);
boolean t =set.contains(3);
boolean t1=set.add(2);
System.out.println(t+" "+t1);
}
}
