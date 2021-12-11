package class_basic;

// * Class Name always Start with capital Letter
// * Ex : Car , Student
public class j1_multipleObjects {
    // * creating variables of class
    // * Attributes of Class
    int x = 12 ;
    String s = "Class VS Object" ;

    public static void main(String[] args) {

        // * creating an object of Class
        // ! object name Ex : carAbility , studentNameRoll
       j1_multipleObjects obj1 = new j1_multipleObjects();

        // * obj1 is the object of class name j1_multipleObjects
        System.out.println(obj1.x);

        // ? creating another object
        j1_multipleObjects obj2 = new j1_multipleObjects();

        System.out.println(obj2.s);
    }
}
