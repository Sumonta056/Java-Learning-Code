package basic_java;

import java.util.Scanner;

public class j4_String_Advance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();                              // * take word as input
        String B = sc.next();

        System.out.println(A.length() + B.length());      // * Length of string

        // ! taking the max length among both string
        int l = Math.min(A.length(), B.length());


        String str = "";

        // ? checking A is lexicographically larger than B or not
        // * we can not compare string in java like this A > B

        for (int i = 0; i < l; i++) {

            // * taking the i number index character
            // * making it LowerCase
            // * converting it into integer
            // * comparing which one is bigger

            if ((int) (A.toLowerCase()).charAt(i) > (int) (B.toLowerCase()).charAt(i)) {
                str = "Yes";
                break;
            } else if ((A.toLowerCase()).charAt(i) < (B.toLowerCase()).charAt(i)) {
                str = "No";
                break;
            }
        }

        // * if both of them equal
        if (str.equals("")) {
            if (A.length() > B.length()) {
                str = "Yes";
            } else {
                str = "No";
            }
        }
        System.out.println(str);

        // * Taking the 1st Element of string
        // * making it Upper case
        // * then print the element
        // * then printing the rest of element of string using sub array method

        System.out.println((A.toUpperCase()).charAt(0) + A.substring(1, A.length()) + " " + (B.toUpperCase()).charAt(0)
                + B.substring(1, B.length()));
        sc.close();
    }
}
