package class_basic;

public class j2_multipleClass_objCalling {
    public static void main(String[] args) {

        // * object of first class
        j0_createClass_andObject name = new j0_createClass_andObject() ;
        System.out.println(name.s);

        // * object of second class
        j1_multipleObjects value = new j1_multipleObjects() ;
        System.out.println(value.x);


        // * calling a method from future class
        j6_parameter_methods obj = new j6_parameter_methods();
        obj.fullThrottle();


        int ans = obj.add(9, 90) ;
    }
}
