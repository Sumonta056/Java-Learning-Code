package HackerRank;

import java.util.Scanner;

public class import_issueFix {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // * direct importing
        java.util.List<String> a = new java.util.ArrayList<>();

        for(int i=0;i<s.length()-k+1;i++){
            a.add(s.substring(i,i+k));
        }
        java.util.Collections.sort(a);
        smallest = a.get(0);
        largest = a.get(a.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
