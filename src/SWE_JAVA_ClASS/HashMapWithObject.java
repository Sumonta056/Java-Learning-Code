package SWE_JAVA_ClASS;

import java.util.HashMap;

public class HashMapWithObject {

    // * hashmap parameter method/function which return a hashmap
    private static HashMap<String , Country>  setCountries(HashMap<String ,Country> objCountries)
    {
        // * creating an object
        Country obj1 = new Country() ;
        obj1.continent = "Asia" ;
        obj1.countryCode = "+089" ;
        obj1.subDomain = "mn" ;
        obj1.countryName = "Myanmar" ;

        // * key = myanmar && value = object of class country
        objCountries.put("Myanmar" , obj1) ;

        // * creating another object
        obj1 = new Country() ;
        obj1.continent = "Asia" ;
        obj1.countryCode = "+091" ;
        obj1.subDomain = "IND" ;
        obj1.countryName = "India" ;

        // * key = India && value = object of class country
        objCountries.put("India" , obj1) ;


        // * returning the hashmap
        return objCountries ;
    }


    public static void main(String[] args) {

        // * hashmap with object value
        HashMap<String , Country> objCountries = new HashMap<>() ;

        objCountries = setCountries(objCountries) ;

        // * System.out.println(objCountries.get("Myanmar").countryCode);

        address s1 = new address() ;
        s1.createAddress("Mridul" , objCountries.get("Myanmar"));
        System.out.println(s1.object.countryCode);
        System.out.println(s1.object.continent);
        System.out.println(s1.object.countryName);
        System.out.println(s1.name);

        s1 = new address() ;
        s1.createAddress("Sumonta" , objCountries.get("India"));
        System.out.println(s1.object.countryCode);
        System.out.println(s1.object.continent);
        System.out.println(s1.object.countryName);
        System.out.println(s1.name);


    }
}
