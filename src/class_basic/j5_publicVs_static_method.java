package class_basic;

public class j5_publicVs_static_method {
    // * Create Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // * Create Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args)
    {
        // * Call the static method
        // * Static methods can be called without creating objects
        myStaticMethod();

        // * Have to Create obj before Calling public method
        // * Public methods must be called by creating objects
        // * myPublicMethod(); This would compile an error
        // ! Create an object of j5_publicVs_static_method Class
        j5_publicVs_static_method Obj = new j5_publicVs_static_method();
        // * Call the public method on the object
        // * public method can be called in multiple classes
        Obj.myPublicMethod();
    }
}