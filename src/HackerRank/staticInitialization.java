package HackerRank;

import java.util.Scanner;


public class staticInitialization {

    static Scanner scan = new Scanner(System.in) ;

    static int b = scan.nextInt();
    static int h = scan.nextInt();
    static boolean check ;

    static
    {
        if(b > 0 && h > 0)
        {
            check = true ;
        }
        else
        {
            check = false ;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        scan.close();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int B, H;
        B = sc.nextInt();
        sc.nextLine();
        H = sc.nextInt();
        sc.close();
        if (B > 0 && H > 0) {
            int area = B * H;
            System.out.print(area);
        } else if (B <= 0 || H <= 0) {

            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        }



    }





