package class_basic;

// * Class Name always Start with capital Letter
// * Ex : Car , Student
public class j0_createClass_andObject {

    // * creating variables of class
    // * Attributes of Class
    // * field of class
    int x = 10 ;
    String s = "Class VS Object" ;

    public static void main(String[] args) {

        // * creating an object of Class
        // ! object name Ex : carAbility , studentNameRoll
        j0_createClass_andObject obj = new j0_createClass_andObject();

        // * obj is the object of class name j0_createClass_andObject

        // ! access attributes by creating an object of the class and using (.):
        System.out.println(obj.x);
    }
}
