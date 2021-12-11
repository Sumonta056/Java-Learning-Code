package class_basic;

// * used to set initial values for object attributes
public class j7_constructor {
    // * Create a class attribute
    int x;
    String p;

    // * Create a class constructor method
    // ! Constructor name must match the class name
    // * it cannot have a return type (like void).
    public j7_constructor() {
        // * Set the initial value for the class attribute x
        x = 5;
    }

    // * creating a constructor with parameter
    // ! both constructor is not same
    // * also work with int
    public j7_constructor(String y)
    {
        p = y;
    }

    public static void main(String[] args) {
        // * Create an object of class Main (This will call the constructor)
        j7_constructor obj = new j7_constructor();
        System.out.println(obj.x);

        // * All classes have constructors by default
        // * if you do not create a class constructor yourself
        // * Java creates one for you.
        // * However, then you are not able to set initial values for object attributes.

        // * calling parameter Constructor
        j7_constructor obj1 = new j7_constructor("hello");
        System.out.println(obj1.p);
    }
}
