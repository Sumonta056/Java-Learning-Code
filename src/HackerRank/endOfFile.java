package HackerRank;

import java.util.Scanner;

public class endOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int i = 1 ;

        // * scan.hasNext() = end of file of string

        while (scan.hasNext())
        {
            System.out.println(i + " " + scan.nextLine());
            i++;
        }
        scan.close();


    }
}
