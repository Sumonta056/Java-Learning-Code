package basic_java;
import java.util.Scanner;
// * must be needed for input taking

public class j3_taking_input {
    public static void main(String[] args) {
        System.out.println("Please Input Something :");

        Scanner scan = new Scanner(System.in);
        // * must be needed for input taking
        // ? System.in means takeinput

        int num1 = scan.nextInt() ;
        System.out.println(num1);

        double d = scan.nextDouble();
        float f = scan.nextFloat();
        long l = scan.nextLong();

        String s = scan.next();           // * take string or word inputting
        String str = scan.nextLine();     // * take string as whole line or sentence
        char ch = scan.next().charAt(0);  // * take one character input

        // * string printing bug
        // * double d = scan.nextDouble();
        // * scan.nextLine();
        // * String s = scan.nextLine() ;

        System.out.println(scan.hasNextInt());
        // * It is a Scanner class method which returns true
        // * if this scanner has another token an integer variable in its input
    }
}
