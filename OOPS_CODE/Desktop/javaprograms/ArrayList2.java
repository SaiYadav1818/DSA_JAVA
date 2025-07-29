import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList2{
    public static void main(String[] args) {
        List<Integer> obj=new ArrayList<>();
        obj.add(0,1);
        obj.add(1,2);
        obj.add(2,3);
        obj.add(3,4);
        obj.add(4,4);
        obj.remove(1);
        System.out.println(obj);
        Iterator<Integer> iter=obj.iterator();

        while (iter.hasNext()) {
         int element = iter.next();
         System.out.println(element);   
        
        if(element==4)
        {
iter.remove();
        }}
        System.out.println(obj);
    }
}
