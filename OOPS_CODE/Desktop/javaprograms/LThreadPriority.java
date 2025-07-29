class th1 extends Thread2
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("my thread"+i);
        }
    }
}
class th2 extends Thread2
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("my thread1"+i);
        }
    }
}
class th3 extends Thread2
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("my thread2"+i);
        }
    }
}
public class LThreadPriority {
    public static void main(String[] args) {
        th1 obj=new th1();
        th2 obj1=new th2();
        th3 obj2=new th3();
        obj.setPriority(Thread2.MIN_PRIORITY);
        obj1.setPriority(Thread2.MIN_PRIORITY);
        obj2.setPriority(Thread2.NORM_PRIORITY);
        obj.start();
        obj2.start();
        obj1.start();
    }
}
