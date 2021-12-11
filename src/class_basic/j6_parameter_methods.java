package class_basic;

public class j6_parameter_methods {
    // * Create a normal method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // * Create a  method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    // * return type method with parameter
    // * can call it into multiple function
    public int add( int x , int y )
    {
        return x+y ;
    }

    // * public static method return type
    // * cannot call it in multiple class
    public static int sum(int i , int j)
    {
        return i+j;
    }


    public static void main(String[] args) {
        j6_parameter_methods myCar = new j6_parameter_methods();
        // * calling normal method
        myCar.fullThrottle();
        // * calling parameter method
        myCar.speed(200);

        // * public return type
        // * must need an obj
        int ans = myCar.add(10 , 68) ;
        System.out.println(ans);

        // * calling public static return type
        int ans1 = sum(9,9);
        System.out.println(ans1);

    }
}
