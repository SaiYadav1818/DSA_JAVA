class MyThread extends Thread2 {
    @Override
    public void run() {
        System.out.println(Thread2.currentThread().getName() + " is in running state.");
        try {
            // Simulate some work with sleep
            Thread2.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread2.currentThread().getName() + " got interrupted.");
        }
        System.out.println(Thread2.currentThread().getName() + " is in terminated state.");
    }
}

public class LThreadLife {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        
        // New state
        System.out.println(thread.getName() + " is in new state.");

        thread.start(); // Thread moves to runnable state
        
        // Thread moves to running state and then to terminated state after run() method completes
        try {
            thread.join(); // Wait for the thread to die
        } catch (InterruptedException e) {
            System.out.println("Main thread got interrupted.");
        }
        
        System.out.println(thread.getName() + " is in terminated state.");
    }
}
