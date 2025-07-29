import java.util.Deque;
import java.util.LinkedList;

class dequeueu{
    public static void main(String[] af){
        Deque<Integer> de=new LinkedList<>();
        de.add(10);
        de.add(23);
        de.addLast(123);
        de.addFirst(2332);
        System.out.println(de);
    }
}