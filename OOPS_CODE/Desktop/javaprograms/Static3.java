class c2{
    static int y;
    static int  x;
    static {
y++;
    }
}
class c extends c2
{
   
   static {
        x++;
    }
    {
        x--;
    }
}
class c3 extends c{
    static int  x;
    static{
        ++x;
    }
    {
        x--;
    }
    {
        x++;
    }
}
public class Static3 {
 public static void main(String[] args) {
   System.out.println(new c3().x); 
 }   
}/* 
After the superclass static initialization, instance initialization blocks of the 
superclass are executed followed by instance initialization blocks of the subclass*/