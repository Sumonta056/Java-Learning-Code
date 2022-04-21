package class_basic;
// * If a class has multiple methods having same name but different in parameters, it is known as Method Overloading

// ! Advantage of method overloading:
// *       Method overloading increases the readability of the program.
// *       we perform method overloading to figure out the program quickly


// ! Different ways to overload the method
// *       By changing number of arguments
// *       By changing the data type


// * Method Overloading: changing no. of arguments
class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}


// * Method Overloading: changing data type of arguments
class Adders{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}

public class j14_overloading {
    public static void main(String[] args) {

        // * type - 1
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));

        // * type - 2
        System.out.println(Adders.add(11,11));
        System.out.println(Adders.add(12.3,12.6));



    }

    // * Method Overloading is not possible by changing the return type of method only
//    class Adder{
//        static int add(int a,int b){return a+b;}
//        static double add(int a,int b){return a+b;}
//    }
//    class TestOverloading3{
//        public static void main(String[] args){
//            System.out.println(Adder.add(11,11));//ambiguity
//        }}
    // * it will show wrong answer


    // * Can we overload java main() method?
    // * Yes, by method overloading
//    class TestOverloading4{
//        public static void main(String[] args){System.out.println("main with String[]");}
//        public static void main(String args){System.out.println("main with String");}
//        public static void main(){System.out.println("main without args");}
//    }
}
