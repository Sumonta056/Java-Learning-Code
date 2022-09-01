package basic_java;

public class j14_stringBuffer {
    // * difference between string and string Buffer
    // * you cannot change the string
    // * u can change / replace / add in string buffer
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("wenamus") ;
        System.out.println(s);


        System.out.println(s.substring(0,4));

        s.replace(2,6,"new");
        System.out.println(s);

        s.insert(3 , "onta") ;
        System.out.println(s);

        s.delete(4,7);
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

        // * StringBuffer s1 = new StringBuffer(s) ;

        // * s1.reverse() ;
        // * String nS = s1.toString() ;



    }
}
