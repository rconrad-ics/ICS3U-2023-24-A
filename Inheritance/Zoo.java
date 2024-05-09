package Inheritance;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(20);
        Dog dog1 = new Dog("Chiwawa");

        animal1.eat();
        animal2.eat();
        dog1.bark();
        dog1.eat();

        // System.out.println(animal1.getWeight());
        // System.out.println(animal2.getWeight());
        // System.out.println(dog1.getWeight());
    }
}
