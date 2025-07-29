class ex extends Thread2
{
    x xx;
    ex(x xxx)
    {
        xx=xxx;
    }
    public void run()
    {
        try{
            synchronized(xx)
            {
xx.Display();
            }
        }
        catch(Exception e)
        {}
    }
}
class x { 
    public void Display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("mythread"+i);
        }
    }
}
public class SynchrizeBlock {
public static void main(String[] args) {
    x obj=new x();
    ex obj1=new ex(obj);
    obj1.start();
}
}
