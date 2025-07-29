
import java.util.ArrayList;
import java.util.Collections;
class ArrayList1 {
    public static void main(String[] args) {
            ArrayList<Integer> list= new ArrayList<Integer>();
            list.add(0);
            list.add(2);
            System.out.println(list);
            int element = list.get(0);
            System.out.println(element);
            //add in between array
            list.add(1,100);
            System.out.println(list);
            //we can updated the element
            list.set(0,5);
            System.out.println(list);
            list.remove(2);
            System.out.println(list);   
        int size=list.size();
        System.out.println(size);
        for( int i=0;i<list.size();i++)
        {
            int e=list.get(i);
            System.out.println(e);
        }
        Collections.sort(list);//collections
        System.out.println(list);
        }
}