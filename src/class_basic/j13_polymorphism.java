package class_basic;
// * Polymorphism means "many forms" with same and different parameter


class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class j13_polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

        // * here we are using same method Animal() with different types
        // * for example animal sound method name is same but different classes has different use
        // * combination of both overloading and overriding

        // * It is useful for code reusability
        // * reuse attributes and methods of an existing class when you create a new class.
    }
}
