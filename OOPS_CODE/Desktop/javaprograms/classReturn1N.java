//Java Program Using a Factory Method Without a Constructor
class MyClass {
    private String message;

    // Static factory method to create an instance of MyClass
    public static MyClass createInstance(String newMessage) {
        MyClass obj = new MyClass(); // Create a new instance
        obj.message = newMessage;     // Set the message directly
        System.out.println(obj.message);
        return obj;                   // Return the instance
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message: " + message);
    }
}

public class classReturn1N{
    public static void main(String[] args) {
        // Create an instance of MyClass using the factory method
        MyClass obj = MyClass.createInstance("Hello from MyClass!");

        // Display the message
        obj.displayMessage();
    }
}
