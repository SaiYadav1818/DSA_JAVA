class MyClass {
    private String message;
    public MyClass(String message) {
        this.message = message;
    }


    public MyClass createInstance(String newMessage) {// factory method that returns a new instance of the class MyClass.
        return new MyClass(newMessage); 
    }

    public void displayMessage() {
        System.out.println("Message: " + message);
    }
}

public class classReturnN {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass("Hello from obj1!");
        obj1.displayMessage();
        MyClass obj2 = obj1.createInstance("Hello from obj2!");
        obj2.displayMessage();
    }
}

/*
 Purpose:

Constructor: A constructor is a special method used to initialize a new object of a class. 
It is called when an object of the class is created.
Factory Method: A factory method is a regular method that returns an instance of a class
 (which can be the same class or a subclass). It can encapsulate the logic of instance creation and can
  return instances based on certain conditions.



Return Type:

Constructor: Constructors do not have a return type (not even void) and have the same name as the class.
Factory Method: Factory methods have a return type (in this case, MyClass) and can have any name.


Invocation:

Constructor: Invoked implicitly when using the new keyword.
Factory Method: Invoked explicitly like any other method.
 */