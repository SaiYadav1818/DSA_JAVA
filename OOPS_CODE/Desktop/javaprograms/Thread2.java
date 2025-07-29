public class Thread2 {
    public static void main(String[] args) {
        Thread obj=Thread.currentThread();
        obj.run();
        System.out.println(Thread.activeCount());
    }
}
