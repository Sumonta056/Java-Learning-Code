package class_basic;
// * Exception Handling - a run time error
// * arise under abnormal condition ( Ex : 1/0 is abnormal condition )

import java.sql.SQLOutput;

public class j17_try_catch_finally {
    public static void main(String[] args) {

        // ! the code I want to will be try block
        try{
            System.out.println("I am at Try !");
            System.out.println(10/0);

            //System.out.println(Integer.parseInt("Whats Up"));

         }
        // ! catch ( exceptionType Variable) - What to do for this in statement
        // ? you can add multiple for 1 try block
        catch (ArithmeticException e)
        {
            System.out.println("I am at Catch Now!");
        }
        catch (NullPointerException e)
        {
            //  no need just for example
        }

        finally {
            System.out.println("I am at Finally Now !");
            // * block of code to be executed after try block
            // * doesn't depend on exception
        }

    }
}

// ? Type of Exception
// * ArithmeticException
// * ArrayIndexOutOfBoundsException
// * ClassNotFoundException
// * FileNotFoundException
// * IOException                     - input / output expception
// * NoSuchMethodException
// * NoSuchFieldException
// * NumberFormatException           - this exception is raised when a method could not convert a string into a numeric format
// * StringIndexOutOfBoundsException - It is thrown by String class methods to indicate that an index is either negative or greater than the size of the string
// * RuntimeException
// * NullPointerException
// * InterruptedException