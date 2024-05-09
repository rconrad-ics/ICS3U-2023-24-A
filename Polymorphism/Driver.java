package Polymorphism;

public class Driver {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        // dog1.makeSound();
        // dog1.bark();

        Cat cat1 = new Cat();
        // cat1.makeSound();
        // cat1.meow();

        Animal animal1 = new Dog(); // dogs are animals - this works
        // Dog animal2 = new Animal();  //syntax error not all animals are Dogs

        //animal1.makeSound(); // dynamic binding - uses Dog's makeSound method because it is a Dog (happens at runtime.)
        animal1.bark();  Animal has no bark method

       // animal1 = new Cat();
       // animal1.makeSound();



    }
}
