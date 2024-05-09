package Inheritance;

/*
 * Everything that is common for ALL Animals will go in this class
 */

public class Animal {
    private int age;
    private int weight;

    // if we do not explicitly write a constructor for a class
    // Java will implicitly write one that calls super() and takes no arguments
    public Animal(){
        super();
    }

    public String toString(){
        return "I am an Animal";
    }

    // public Animal(){
    //     age = 0;
    //     weight = 10;
    // }

    public Animal(int weight){
        this.weight = weight;
    }

    public void eat(){
        weight++;
    }

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }
}
