package class_basic;

// * this: to refer current class instance variable
public class j8_whenToUse_this {
    int rollno;
    String name;
    float fee;

    // * Constructor Calling different
    // * calling this pointer
    // * In the above example, parameters (formal arguments) and instance variables are same.
    // * So, we are using this keyword to distinguish local variable and instance variable.
    j8_whenToUse_this(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }

    void display(){System.out.println(rollno+" "+name+" "+fee);}


    public static void main(String[] args) {
        j8_whenToUse_this s1=new j8_whenToUse_this(111,"ankit",5000f);
        j8_whenToUse_this s2=new j8_whenToUse_this(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}

