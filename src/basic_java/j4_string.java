
// Documentation Section
// * Name - Sumonta Saha
// learning Java
package basic_java;

public class j4_string {
    public static void main(String[] args) {

        // * length of string
        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length " + txt1.length());


        // * upper case - lower case
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"


        // * find character in string
        // * return the index of that character
        // ! returns the first one (EX - poop) indexOF(p) = 1
        // ! Java counts positions from zero.
        String tx = "Please locate where 'locate' occurs!";
        System.out.println(tx.indexOf("locate"));   // ? Outputs 7


        // * connect two
        // ! added an empty text (" ") to create a space
        // ? Another method
        // ! System.out.println(firstName.concat(lastName));
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName+lastName;
        System.out.println(firstName + " " + lastName);

        // * Access Special Character
        // *       \'	  '	Single quote
        // *       \"	  "	Double quote
        // *       \\	  \	Backslash


        // ? what if we add a number and a string
        String x = "10";
        int y = 20;
        String z = x + y;   // * z will be 1020 (a String)
                            // * String Concatenation


        // * object style string calling
        String s1 = new String("Hello") ;
        System.out.println(s1);

        // * character array string
        char[] name = {'m', 'r' , 'i','d' , 'u' ,'l'} ;
        System.out.println(name);

        // * check two string same or not
        // * boolean = s1.equal(s2) ;


        // * check a element is available at string
        String s2 = new String("H") ;
        boolean check = s1.contains(s2);
        // ! s1.contains("string") ;
        System.out.println(check);


        // * s1.equalsIgnoreCase(s2);
        // * ignore uppercase lowercase while checking


        // * check empty string
        // *  s1.isEmpty() ;

        // * string s = s1.toUpperCase();
        // * s1.toLowerCase()

        // * check first string or character
        // * check last string or character
        boolean i  = s1.startsWith("A") ;
        boolean j  = s1.endsWith("l") ;


        // * string arrays
        String[] names = {"k","l" } ;
        for(String p :names)
        {
            System.out.println(p);
        }

        // * index of a character in string
        String kl ="Bangladesh" ;
        System.out.println(kl.indexOf('a'));

        // * last index of a character in string
        System.out.println(kl.lastIndexOf('a'));

        // * replace a character in string
        String p = kl.replace('a','A') ;
        System.out.println(p);
        System.out.println(kl);








    }
}
