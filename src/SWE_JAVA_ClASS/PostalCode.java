package SWE_JAVA_ClASS;

public class PostalCode {

    String Country  ;
    String Division ;
    String Thana ;
    String SubOffice ;
    //int PostalCode ;

    String Name;
    int postal ;
    PostalCode object ;

    // * creating a constructor
    public PostalCode(String Country , String Division ,String Thana ,String SubOffice)
    {
        this.Country = Country ;
        this.Division = Division ;
        this.Thana = Thana ;
        this.SubOffice = SubOffice ;

    }

    // * creating another constructor
    public PostalCode(String n , int p , PostalCode o)
    {
        Name   = n ;
        postal = p ;
        object = o ;
    }

//    public void createAddress(String n ,int p , PostalCode o)
//    {
//        Name   = n ;
//        postal = p ;
//        object = o ;
//
//    }

    public void printPostal()
    {
        System.out.println("UserName : "+Name);
        System.out.println("Postal Code :"+postal);
        System.out.println("Country Name :"+object.Country);
        System.out.println("Division Name :"+object.Division);
        System.out.println("Thana Name :"+object.Thana);
        System.out.println("Sub Office Name :"+object.SubOffice);


        System.out.println("\n");

    }

}
