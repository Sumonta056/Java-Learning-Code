package basic_java;

import java.util.Arrays;

public class j9_array {
    // * Passing Array to a Method in Java
    // * function type
    // ! creating a method which receives an array as a parameter
    static void min(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];

        System.out.println(min);
    }

    public static void main(String[] args) {

        // * array in Java
        // * variable type[] variable name ;
        String[] cars;
        String[] carrs = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        int[] arr = new int [] {1, 2, 5, 3, 4};
        // * int arr[8] ;
        int[] ar = new int[8];         // ? best way
        // ! int a[] = new int[5];



        // * Access element of array
        System.out.println(carrs[0]);
        // * Outputs Volvo

        // * array length
        System.out.println(carrs.length);

        // * array with loop
        String[] cas = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cas.length; i++) {
            System.out.println(cas[i]);
        }

        // * for each loop
        String[] crs = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : crs) {
            System.out.println(i);
        }

        // * 2d array
        // ! methods
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int[][] array = new int [8][8] ;
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7


        // * Passing Array to a Method in Java
        int[] a ={33,3,4,5};//declaring and initializing an array
        min(a);//passing array to method

        // * sort array
        Arrays.sort(arr);

        for(int i :arr)
        {
            System.out.println(i+" ");
        }



    }
}
