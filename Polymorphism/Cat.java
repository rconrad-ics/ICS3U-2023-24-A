package Polymorphism;

public class Cat extends Animal{
    public void makeSound(){    // overwritten Parent Version
        meow();
    }

    public void meow(){
        System.out.println("Meow!");
    }
}
