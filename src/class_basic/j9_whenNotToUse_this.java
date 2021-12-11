package class_basic;
// * If local variables(formal arguments) and instance variables are different
// *  there is no need to use this keyword

public class j9_whenNotToUse_this {
    int rollno;
    String name;
    float fee;

    // * Constructor Calling different
    // * If local variables(formal arguments) and instance variables are different
    // *  there is no need to use this keyword

    j9_whenNotToUse_this(int r,String n,float f){

        rollno=r;
        name=n;
        fee=f;
    }

    void display(){System.out.println(rollno+" "+name+" "+fee);}


    public static void main(String[] args) {
        j9_whenNotToUse_this s1=new j9_whenNotToUse_this(111,"ankit",5000f);
        j9_whenNotToUse_this s2=new j9_whenNotToUse_this(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
