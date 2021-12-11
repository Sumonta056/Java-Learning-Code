package basic_java;
// *               array vs arraylist
// * resizeable     no       yes
// * iterator       no       yes
// *                fast     slow
// *       array.length()    arr.size()

// ! must have to call this
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class j12_arrayList {

    public static void main(String[] args) {
        // * creating an arraylist
        // * Data Type always capital , ex - Integer
        // ? ArrayList<Integer> arr = new ArrayList<Integer>() ;
        ArrayList<Integer> arr = new ArrayList<>() ;

        // * adding element
        // * type - 1
        arr.add(10);
        arr.add(9);
        arr.add(11);

        // * type 2 (add element based on index)
        // * adding 8 at index 3
        // * it doesn't replace the value
        // * arr[0] = 1 ;  arr.add(0,8);
        // * it will be arr[0] = 8 , arr[1] = 1 ;
        arr.add(3,8);

        // * printing array size
        System.out.println(arr.size());

        // * printing arraylist element
        for( int i : arr)
        {
            System.out.println(i + " ");
        }


        // * another method
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next() + " ");
        }

        // * accessing element
        // * arr.get(i) ;
        int x = arr.get(0);

        // * remove an element based on index
        arr.remove(2);
        System.out.println(arr); // ! another printing method


        // * remove all data
        // * arr.removeAll(arr);
        // * arr.clear();

        // * check arraylist is empty or not
        boolean check = arr.isEmpty() ;

        // * check or search for element
        // * check element 9 is available or not
        boolean search = arr.contains(9);
        System.out.println(search);

        // * check index of a value
        int index = arr.indexOf(9);
        System.out.println(index);

        // * get a value based on index
        int value = arr.get(1) ;
        System.out.println(value);

        // * replace a value in arraylist based on index
        // * can't add value just replace
        arr.set(1,100);
        System.out.println(arr);

        // * addall
        // * ArrayList<Integer> arr1 = new ArrayList<>(arr);
        ArrayList<Integer> arr1 = new ArrayList<>() ;

        arr1.addAll(arr);
        System.out.println(arr1);


        // * check 2 arraylist are same or not
        boolean same = arr.equals(arr1);
        System.out.println(same);

        // * sort arraylist
        Collections.sort(arr);
        System.out.println(arr);

        // * reverse sort
        // * Collections.sort(arr , Collections.reverseOrder() );
        arr.sort(Collections.reverseOrder());
        System.out.println(arr);





    }
}
