import java.util.*;
class monkey {
     int a=10;
        int b=20 ;
        int c;
    void Ebanana()
    {
       
        c=a+b;
        System.out.println("Monkey eat the bannana are"+""+c);
    }
}
class humanbeigs  extends monkey {
    void Erice()
    {
        int x=20;
        int d;
        d=x+a+b;
        System.out.println("human beings eat the no of kgs of  rices are"+""+d);
    }
}
class Sinheritance {
    public static void main(String args[])
    {
        
humanbeigs obj=new humanbeigs();
obj.Ebanana();
obj.Erice();
    }
}