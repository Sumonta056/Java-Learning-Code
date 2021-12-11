package class_basic;
// * also, can access the methods of class via objecy
public class j4_methods {

    // * create a method or function
    // ! u can also call a method under main function
    static void myMethod() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        // * call the method
        myMethod();
        underMainFunction();
    }

    // * method under main function
    static void underMainFunction()
    {
        System.out.println("Another method type calling");
    }
}
