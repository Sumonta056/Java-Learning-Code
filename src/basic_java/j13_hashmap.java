package basic_java;

import java.util.HashMap;

// * store data based on key and value
// * key , value
public class j13_hashmap {

    public static void main(String[] args) {
        // * here key = customer id unique
        // * value = customer name
        // ! HashMap<key , value > customer = new HashMap<>();
        HashMap<Integer ,String> customer = new HashMap<>();

        // * also, can create any type of data type
        HashMap<String,String> s = new HashMap<>() ;

        // * can create class object as a hashmap
        HashMap<String , j1_print> object = new HashMap<>();

        // * add items with put
        // ! cannot put duplicate key
        customer.put(101 , "Sumonta") ;
        customer.put(103 , "Summon") ;
        customer.put(102, "Mridul") ;



        // * access the value based on key
        String name = customer.get(101);
        System.out.println(name);

        // * remove an element based on key
        customer.remove(101);

        // * remove all key
        // ? customer.clear();

        // * hashmap size
        int n = customer.size() ;

        // * look up through hashmap with only key
        // * keyset()
        for(int i : customer.keySet())
        {
            System.out.println(i);
        }


        // * look up through hashmap with only value
        // * = values()
        for(String i : customer.values())
        {
            System.out.println(i);
        }

        // * look up with key + value
        for(int i : customer.keySet())
        {
            System.out.println(i);
            System.out.println(customer.get(i));
        }

        // * check e key is available or not
        boolean check1 = customer.containsKey(102);
        boolean check2 = customer.containsValue("Mridul") ;
        System.out.println(check1+" "+check2);

    }
}
