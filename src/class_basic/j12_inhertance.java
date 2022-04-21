package class_basic;

//* Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object

//* The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
//* When you inherit from an existing class, you can reuse methods and fields of the parent class.
//* Moreover, you can add new methods and fields in your current class also

// * Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

// ! Why use inheritance in java
// *       For Method Overriding (so runtime polymorphism can be achieved).
// *       For Code Reusability.


// ? basic inheritance formation style
public class j12_inhertance extends j12_baseCLass {

    String carName2 = "Audi" ;
    public void car2Color()
    {
        System.out.println("white");
    }


    // * main function
    public static void main(String[] args) {

        j12_inhertance objCar = new j12_inhertance();

        // car1 and previous class
        System.out.println(objCar.carName1);

        objCar.carColor();


        // car2 and main class
        System.out.println(objCar.carName2);
        objCar.car2Color();

        // * with inheritance we can bring up multiple class under one object
        // * we can reuse any other previous class with this extend inheritance

    }
}
