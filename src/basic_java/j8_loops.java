package basic_java;

public class j8_loops {
    public static void main(String[] args) {

        // * switch
        // ! case 1 : ( another way)
        int day = 4;
        switch (day) {
            case 1 -> System.out.println("Today is Saturday");
            case 6 -> System.out.println("Today is Sunday");
            default -> System.out.println("Looking forward to the Weekend");
        }
        // ? Outputs "Looking forward to the Weekend"
        // ? Case 4 : Outputs "Today is Sunday"


        // * while
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // * do while
        int j = 0;
        do {
            System.out.println(i);
            j++;
        }
        while (j < 5);

        // * for
        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println(i1);
        }


        // ?  best for java
        // * for each
        // ! special shortcut looping
        // * for (type variableName : arrayName) {
        // *                                       code block to be executed
        // *                                     }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // ! for (type variableName : arrayName)
        for (String k : cars) {
            System.out.println(k);
        }

    }
}
