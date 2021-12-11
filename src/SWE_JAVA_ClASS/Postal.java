package SWE_JAVA_ClASS;


public class Postal
{
    String Name;
    int postal ;
    PostalCode object ;

    public void createAddress(String n ,int p ,  PostalCode o)
    {
        Name   = n ;
        postal = p ;
        object = o ;

    }

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
