package SWE_JAVA_ClASS;

public class D1_address {
    String HouseName = "" ;

    // * initial declaration of variable for future (no parameter callings)
    // * only String HouseName will give null value

    String RoadNo = "" ;
    String Area = "" ;
    String Country = "" ;

    // ! another way
    // * D1_address(String H, String R , String A , String C)
    public void createAddress(String H, String R , String A , String C)
    {
        HouseName = H ;
        RoadNo = R ;
        Area = A ;
        Country = C ;

    }

    public void printAddress()
    {
        System.out.println(" House Name : " + HouseName + "\n" +
                           " Road No : " + RoadNo + "\n" +
                           " Area : " + Area + "\n" +
                           " Country : " + Country + "\n" );
    }
}
