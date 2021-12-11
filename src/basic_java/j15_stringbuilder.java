package basic_java;
// * StringBuilder is non-synchronized i.e. not thread safe.
// * It means two threads can call the methods of StringBuilder simultaneously.
// ! StringBuilder is more efficient than StringBuffer.

public class j15_stringbuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Mridul") ;
        System.out.println(s);

        // * add another string with current string
        // ? add any data type
        s.append(" Saha");
        s.append(0) ;
        System.out.println(s);

        // * reverse the string
        s.reverse();
        System.out.println(s);

        // * delete from index i < to <  j
        s.delete(2, 5);
        System.out.println(s);

        // * fixed the length
        s.setLength(5);
        System.out.println(s);

        // * String s = "abbaa" ;

        // * StringBuilder s1 = new StringBuilder(s) ;

        // * s1.reverse() ;
        // * String nS = s1.toString() ;
    }
}
