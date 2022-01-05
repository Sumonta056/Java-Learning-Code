// Documentation Section
// * Name - Sumonta Saha
// learning Java

package basic_java;
//        Packages are used to group the related classes.
//        The "Package" keyword is used to create packages in Java.

public class j1_print
//         In Java, every program must contain a class.
// !       The filename and name of the class should be the same.

// * Naming Conventions
// ? For classes, we use Pascal Convention.
// Example: Main, MyScanner , SumontaSahaMridul

// ? For functions and variables, we use camelCaseConvention
// Example : myScanner, myMarks
{
    // * just type main for this code(shortcut)
    public static void main(String[] args)
            //* void   = no return type function
            //* main   = start the java program
            //* public = access modifier ( can access from anywhere)
            //* static = run the function without making object in class
                       //* we don't have to call obj.function() ; for static
                       //* we call direct like function() ;
    {
        // * just type sout (shortcut)
        System.out.println("Hello World");
            // ! println mean print with new line
        System.out.print("didn't enter");
           // ! print mean print without new line
        System.out.print("didn't enter");

        // * print multiple things with + sign
        String name = "John";
        System.out.println("Hello " + name);
        int x = 5;
        int y = 6;
        System.out.println(x + y);


        // * print new line
        System.out.print("\n");

    }
}
