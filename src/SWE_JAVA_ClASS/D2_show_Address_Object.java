package SWE_JAVA_ClASS;

public class D2_show_Address_Object {
    public static void main(String[] args) {

        D1_address x = new D1_address();
        x.createAddress("Mridul's House" , " 2019", "Narayanganj" , "Bangladesh");
        x.printAddress();

        System.out.println("\n");

        D1_address y = new D1_address();
        y.createAddress("Sumonta's House" , " 2059", "Sylhet" , "Bangladesh");
        y.printAddress();

    }
}
