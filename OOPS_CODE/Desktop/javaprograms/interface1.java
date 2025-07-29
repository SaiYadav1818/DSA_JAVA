 interface abc {
    void m1();
}
class pqr implements abc{
   public  void m1()
    {
        System.out.println("abstract method");
    }
}
public class interface1 {
    public static void main(String[] args) {
     abc r;
     r=new pqr();
     r.m1();   
    }
}
/*public: The method is accessible from any other class.
protected: The method is accessible within its own package and by subclasses.
default (package-private): The method is accessible only within its own package. This is the default access level when no modifier is specified.
private: The method is accessible only within its own class.
 */