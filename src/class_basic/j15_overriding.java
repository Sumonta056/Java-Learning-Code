package class_basic;
//* If subclass (child class) has the same method as declared in the parent class, it is known as method overriding
//* provide the specific implementation of a method which is already provided by its superclass

// ! Rules for Java Method Overriding
// *        The method must have the same name as in the parent class
// *        The method must have the same parameter as in the parent class
// *        There must be an IS-A relationship (inheritance)


//Creating a parent class.
class Vehicle{
    //defining a method
    void run(){System.out.println("Vehicle is running");}
}

class Bike2 extends Vehicle {
    //defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely");
    }
}


public class j15_overriding {
    public static void main(String[] args) {

        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method

        // * here run() is an example of method overriding
        // * different class but same name method different works
    }
}
