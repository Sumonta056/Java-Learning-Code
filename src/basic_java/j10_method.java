package basic_java;

// * A method is a block of code which only runs when it is called.
// * You can pass data, known as parameters, into a method.
// * Methods are used to perform certain actions, and they are also known as functions.
// * Why use methods? To reuse code: define the code once, and use it many times.

// ? we call create a method above or down of main class ( location doesn't matter )

public class j10_method {

    // ? creating a method
    static void myMethod() {
        // code to be executed
        System.out.println("I just got executed!");
    }

    //   *     static means that the method belongs to the Main class
    //   *     and not an object of the Main class.
    //   *     call it without creating / calling an object
    //   *     void means that this method does not have a return value.



    // ? creating a parameter method
    static void myMethods(String name, int age) {
        System.out.println(name + " is " + age);
    }


    // ? creating a parameter return type method
    static int myMethoda(int x, int y) {
        return x + y;
    }


    // ! main
    public static void main(String[] args) {

        // * calling method ;
        myMethod();


        // * calling parameter method
        myMethods("Liam", 5);
        myMethods("Jenny", 8);
        myMethods("Anja", 31);


        // * calling return type parameter method
        int z = myMethoda(5, 3);
        System.out.println(z);


        // * recursion with java
        int result = sum(5, 10);
        System.out.println(result);

    }

    // * recursion function
    // * u can also call it below main function
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }


}
