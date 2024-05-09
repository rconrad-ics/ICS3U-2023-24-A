package Inheritance;

public class Dog extends Animal{
    private String breed;

    public Dog(String breed){
        this.breed = breed;
    }

    public void eat(){
       for (int i = 0; i < 5; i++) {
        super.eat();
       }

    }


    public String toString(){
        return "I am a yappy little dog!";
    }


    public void bark(){
        System.out.println("Bark! Bark!");
    }
}
