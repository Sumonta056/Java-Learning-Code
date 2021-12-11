// Documentation Section
// * Name - Sumonta Saha
// learning Java

// ** Rules for declaring a variable name

// ! 1 Must not begin with a digit. (E.g., 1arry is an invalid variable)
// 2 Name is case sensitive. (Harry and harry are different)
// 3 Should not be a keyword (like Void).
// 4 White space is not allowed. (int Code With Harry is invalid)
// 5 Can contain alphabets, $character, _character, and digits if the other conditions are met.


// **    Data Type	Size	Value Range
//        1. Byte	1 byte	-128 to 127
//        2. short	1 byte	-32,768 to 32,767
//        3. int	2 byte	-2,147,483,648 to 2,147,483,647
// !                      (2^32)
//        4. float	4 byte	3.40282347 x 1038 to 1.40239846 x 10-45
//        5. long	8 byte	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// !                      (2^64)
//        6. double	8 byte	1.7976931348623157 x 10308, 4.9406564584124654 x 10-324
//        7. char	2 byte	0 to 65,535
//        8. boolean	Depends on JVM	True or False


package basic_java;

public class j2_variableAndDataType
{
 public static void main(String[] args)
 {
  byte a;
  short b;
  int num;
  float f;
  long p;
  double d;
  char c;
  boolean bool;

  // * literals
  char h = 'A' ;
  byte age = 34 ;
  int ag2 = 56 ;
  long number = 12345679010L;   // * have to use L for long declare  ( by default int)
  float n = 3.4f;               // ! have to use f for float declare  ( by default double)
  double dh = 2.89343;

//  * Use float or double?
//  The precision of a floating point value indicates how many digits the value can have after the decimal point.
//  The precision of float is only six or seven decimal digits,
//  while double variables have a precision of about 15 digits.
//  Therefore, it is safer to use double for most calculations.

  // ? string 'S' capital always
  String s = "Hello parker";


// * Scientific Numbers
//  A floating point number can also be a scientific number with an "e" to indicate the power of 10:
//  Example
  float f1 = 35e3f;
  double d1 = 12E4d;
  System.out.println(f1);


 }

}
