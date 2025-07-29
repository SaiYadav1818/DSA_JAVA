class car {
    int fuel;
    int n;
    car(int fuel) {
        this.fuel = fuel;
    }
    public void addFuel() {
        fuel++;
    }

    public void display() {  
        System.out.println(fuel);
    }
}

class red extends car {

    red(int n) {
        super(2 * n); 
    }
}

public class callingN {
    public static void main(String[] args) {
        car obj = new red(20); 
        red obj3=new red(20);
        car obj1=new car(20);
        obj3.addFuel();
        obj3.display();
        obj.addFuel();
        obj.display(); 
        obj1.addFuel();
        obj1.display();
     
    }
}

