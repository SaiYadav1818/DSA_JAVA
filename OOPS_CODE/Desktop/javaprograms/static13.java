class x{
    static{
        y.display();
    }
}
class y extends x{
    static void display(){
      System.out.println("lite");
    }
}
public class static13 {
    public static void main(String[] args) {
     y.display();   //subclass
    }
}
