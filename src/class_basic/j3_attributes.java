package class_basic;

public class j3_attributes {
    // * variables of class
    // * Attributes of Class
    // ! access attributes by creating an object of the class and using (.):

    // * create multiple attributes
    String Name = "Sumonta";
    String changeName = " " ; // * setting an initial condition of variable
    String newName ;

    int x =  7 ;
    int changeX ;

    // * Stop the modifying the value using final
    final int y = 10;

    public static void main(String[] args) {

        j3_attributes obj = new j3_attributes();

        // * modify obj
        obj.changeX = 58 ;
        System.out.println(obj.changeX);

        // * overload value of obj
        obj.Name = "Mridul" ;
        System.out.println(obj.Name);

        // * Stop the modifying the value
        // * will show an error
        //  ?  obj.y = 17;
        System.out.println(obj.y);

        // * multiple objects
        j3_attributes obj2 = new j3_attributes();
        obj2.x = 17 ;

        System.out.println(obj2.x);
        System.out.println(obj.x);

        // * changing the value of attributes in obj
        // * doesn't change the initial value of attributes

    }

}
