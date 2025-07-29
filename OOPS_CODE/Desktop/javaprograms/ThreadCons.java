import java.util.*;
class print  implements Runnable{
private int x;
private int y;
print(int x,int y)
{
    this.x=x;
    this.y=y;
}
public void run()
{
    if(Thread.currentThread().getName().equals("even"))
    {
        for(int i=x;i<=y;i++)
        {
            if(i%2==0)
            {
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
    else if(Thread.currentThread().getName().equals("odd"))
    {
        for(int j=x;j<=y;j++)
        {
            if(j%2!=0)
            {
                System.out.println(Thread.currentThread().getName()+": "+j);
            }
        }
    }
}
}
class ThreadCons {
    public static void main(String[] args) {
        System.out.println("enter starting even number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter ending even number");
        int b=sc.nextInt();
        System.out.println("enter starting odd number");
        int c=sc.nextInt();
        System.out.println("enter ending odd number");
        int d=sc.nextInt();
        Thread t1=new Thread(new print(a,b),"even");
        Thread t2= new Thread(new print(c,d),"odd");
        t1.start();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {

        }
        t2.start();
    }
}