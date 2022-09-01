package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayListStringSorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();

        String s = scan.next();
        int size = scan.nextInt();

        //* find all substring
        for(int i = 0 ; i <= s.length() - size ; i++)
        {
            String temp = s.substring(i , i+size);

            arr.add(temp);  //* adding element to array
        }

        Collections.sort(arr);                        // * sorting string into lexicographically
        System.out.println(arr.get(0));               // * printing the lowest string
        System.out.println(arr.get(arr.size() - 1));  // * printing the highest element



    }
}
