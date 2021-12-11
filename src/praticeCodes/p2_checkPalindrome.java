package praticeCodes;

public class p2_checkPalindrome
{
    public static void main(String[] args) {
        String s = "abbaa" ;

        StringBuilder s1 = new StringBuilder(s) ;

        s1.reverse() ;
        String nS = s1.toString() ;

        if(nS.equals(s))
        {
            System.out.println("Yes");

        }

        else
        {
            System.out.println("No");
        }
    }
}
