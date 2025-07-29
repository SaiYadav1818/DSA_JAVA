//import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class queue {
    public static void main(String[] args) {
       // Queue<Integer> queue=new LinkedList<>();
Queue<Integer> queue=new ArrayBlockingQueue<>(3);
queue.offer(20);
queue.offer(30);
queue.offer(40);
System.out.println(queue.offer(20));
System.out.println(queue.poll());
System.out.println(queue.peek());
System.out.println(queue.size());
queue.clear();
System.out.println(queue.isEmpty());
    }
}
