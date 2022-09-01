package HackerRank;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        scan.close();

        boolean found = true;

        // * reverse using for better A.charAt(i)
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                found = false;
                break;
            }
        }
        System.out.println(found ? "Yes" : "No");

    }
}
