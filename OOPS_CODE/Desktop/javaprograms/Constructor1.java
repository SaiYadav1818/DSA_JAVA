class fan{
    private String pid;
    private int money;
    private String name;
    private int cal;
    fan(String pid,int money,String name)
    {
        this.pid=pid;
        this.money=money;
        this.name=name;
    }
    public int  maths(){
cal=money*money;
return cal;
    }
    public void getDiscount(int dis)
    {
        money+=dis;
    }
    public String getName()
    {
return name;
    }
    public int getFinalPrice()
    {
        return money;
    }
    public String getId()
    {
        return pid;
    }
}
class tv extends fan{
    int cal1;
    tv(String pid,int money,String name,int cal1)
    {
 super(pid,money,name);
this.cal1=cal1;
    }

public void getDiscount(int disc)
{
 super.getDiscount(disc);
 System.out.println(getName());
}
public int getCal()
{
    return cal1;
}
public void changeCal(int update)
{
cal1+=update;
}
}
public class Constructor1 {
    public static void main(String[] args) {
        fan obj=new fan("fan1",18,"vizard");
        String pid="fan1";
        int money=1000;
        String name="mrf";
        int cal1=2000;
       
        obj.getDiscount(10);
//System.out.println(obj.maths());
//System.out.println(obj.getName());
tv obj1 =new tv(pid,money,name,cal1);
obj1.getDiscount(20);
System.out.println(obj1.getName());
System.out.println(obj1.getFinalPrice());
System.out.println(obj1.getCal());
obj1.changeCal(1000);
System.out.println("after updation of call "+obj1.getCal());
    }
}
