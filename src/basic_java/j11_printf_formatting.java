package basic_java;
import java.util.Scanner;

// * check this website
// * https://www.baeldung.com/java-printstream-printf

public class j11_printf_formatting {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < 3; i++) {
//            String str = sc.next();
//            int x = sc.nextInt();
//            // * formatting
//            System.out.printf("%-15s", str);
//
//            System.out.printf("%03d%n", x );
//
//            // * java           100
//            // * string + 15character gap
//            // * exactly 3 digit starting with 0
//        }

        // * like c in printing
        char c = 's' ;
        int a = 90 ;
        float f = 8.00f ;
        double d = 9.0083;

        System.out.printf("%c\n" ,c);
        System.out.printf("%d\n" ,a);
        System.out.printf("%.2f\n" ,f);
        System.out.printf("%f\n" ,d);
    }

}
