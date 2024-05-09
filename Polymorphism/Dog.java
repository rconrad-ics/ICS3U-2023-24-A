package Polymorphism;

public class Dog extends Animal{
    public void makeSound(){
        bark();
    }

    public void bark(){
        System.out.println("Woof!");
    }
}
