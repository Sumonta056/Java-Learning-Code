package HackerRank;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int n = scan.nextInt();
        scan.close();

        String s = "";
        s = Integer.toString(n);

        if(n == Integer.parseInt(s))
        {
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }


    }
}
