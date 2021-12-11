package SWE_JAVA_ClASS;

import java.util.HashMap;

public class MainPostal {

    public static void main(String[] args) {

        HashMap<Integer , PostalCode> postal = new HashMap<>();

        postal = setPostal(postal) ;

        PostalCode s1 = new PostalCode("Farhan" ,1222, postal.get(1222));
        // s1.createAddress("Farhan" ,1222, postal.get(1222));
        s1.printPostal();

        s1 = new PostalCode("Rakib" ,1903,  postal.get(1903));
        // s1.createAddress("Rakib" ,1903,  postal.get(1903));
        s1.printPostal();

        s1 = new PostalCode("Mridul" , 1400, postal.get(1400));
        //s1.createAddress("Mridul" , 1400, postal.get(1400));
        s1.printPostal();

    }

    private static HashMap<Integer , PostalCode> setPostal(HashMap<Integer,PostalCode> postal)
    {
        PostalCode obj = new PostalCode("Bangladesh" , "Dhaka" , "Motijheel" ,"BangabhabanTSO");
//        obj.Country = "Bangladesh" ;
//        obj.Division = "Dhaka" ;
//        obj.Thana = "Motijheel" ;
//        obj.SubOffice = "BangabhabanTSO" ;

        postal.put(1222 , obj) ;

        obj = new PostalCode("Bangladesh" , "Dhaka" , "Narayanganj Sadar" ,"Narayanganj Sadar");
//        obj.Country = "Bangladesh" ;
//        obj.Division = "Dhaka" ;
//        obj.Thana = "Narayanganj Sadar" ;
//        obj.SubOffice = "Narayanganj Sadar" ;

        postal.put(1400 , obj) ;

          obj = new PostalCode("Bangladesh" , "Tangail" , "Delduar" ,"Patharail");
//        obj.Country = "Bangladesh" ;
//        obj.Division = "Tangail" ;
//        obj.Thana = "Delduar" ;
//        obj.SubOffice = "Patharail" ;

        postal.put(1903 , obj) ;

        return postal ;
    }
}
