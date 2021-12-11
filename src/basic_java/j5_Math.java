package basic_java;

public class j5_Math {
    public static void main(String[] args) {

        // * find max number
        int n = Math.max(5, 10);
        System.out.println(n);

        // * Find minimum number
        int n1 = Math.min(5, 10);
        System.out.println(n1);

        // * Square root
        // ! double type must
        double n2 = Math.sqrt(64);
        System.out.println(n2);

        // * absolute value
        int n3 = Math.abs((-8));
        System.out.println(n3);

        // * random number
        // ! double type
        // ! initial range ( 0 t0 1)
        double n4 = Math.random();
        System.out.println(n4);


        // * change random number range
        // ! type casting
        int randomNum = (int)(Math.random() * 101);  //  * 0 to 100
        System.out.println(randomNum);





    }
}
