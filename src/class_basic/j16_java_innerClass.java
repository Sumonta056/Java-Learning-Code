package class_basic;

public class j16_java_innerClass {

    int x = 10 ;

    class innerClass{
        int y = 20 ;
    }

    static class innerClass2
    {
        int y = 9 ;
    }

    class check{
        public int method()
        {
            return x;
        }
    }

    public static void main(String[] args) {

        // * create main class object
        j16_java_innerClass obj = new j16_java_innerClass() ;

        // * print main class object
        System.out.println(obj.x);

        // * access inner class
        j16_java_innerClass.innerClass obj2 = obj.new innerClass() ;

        // * print inner class element
        System.out.println(obj2.y);

        // * static inner class
        j16_java_innerClass.innerClass2 obj3 = new j16_java_innerClass.innerClass2();
        System.out.println(obj3.y);


        // * accessing outer class from inner class
        j16_java_innerClass obj4 = new j16_java_innerClass();
        j16_java_innerClass.check obj5 = obj4.new check();

        System.out.println(obj5.method());

    }
}
