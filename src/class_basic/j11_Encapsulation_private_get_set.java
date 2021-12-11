package class_basic;
// * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users

// * declare class variables/attributes as private
// * provide public get and set methods to access and update the value of a private variable
public class j11_Encapsulation_private_get_set {

    // * restricted access with private(only accessible in this class only)
    private String name;

    // ! Getter
    // * The get method returns the variable value
    public String getName() {
        return name;
    }

    // ! Setter
    // * the set method sets the value
    public void setName(String newName) {
        this.name = newName;
    }


    public static void main(String[] args) {
        // * let's play with the private variable which is not accessible outside current class
        j11_Encapsulation_private_get_set obj = new j11_Encapsulation_private_get_set();

        // * set or change the private value
        obj.setName("Mridul");

        // * print the private the value
        System.out.println(obj.getName());

        // * if we don't use get set , we will get error accessing private variable
        // * cannot do like public variable


        // !Why Encapsulation?
        // * Better control of class attributes and methods
        // * Class attributes can be made read-only (if you only use the get method),
        // * or write-only (if you only use the set method)
        // * Flexible: the programmer can change one part of the code without affecting other parts
        // * Increased security of data
    }


}
