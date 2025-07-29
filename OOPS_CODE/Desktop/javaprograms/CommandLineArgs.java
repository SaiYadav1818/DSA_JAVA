public class CommandLineArgs{
    public static void main(String[] args) {
        // Iterate through each argument passed from the command line
        for (int i = 0; i < args.length; i++) {
            // Print each argument followed by a space
            System.out.println(args[i] + " ");
        }
        // Exit the program
        //System.exit(0);
    } 
}

/*

 State: The state of an object is represented by its attributes or fields. These are variables that hold data specific to the object.
  For example, in a Person class, attributes might include name and age.

Behavior: The behavior of an object is defined by its methods. Methods are functions associated with an
 object that can perform operations on the object's data or provide some functionality. For example, a Person 
 class might have methods like speak() or walk().

Identity: Every object has a unique identity, even if its state and behavior are identical to another object. This identity is typically 
represented by the memory address where the object is stored.
 */