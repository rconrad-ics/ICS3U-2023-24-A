package Objects;

public class Dog {
    //Attributes
    public String name;
    public String breed;
    public int age;
    private boolean isHungry;

    //Constructor to initialize attributes
    public Dog(String dogName, String dogBreed, int dogAge){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        isHungry = true; //by default a new dog is hungry
    }
    //method to make the dog bark
    public void bark(){
        System.out println(name + " says Woof!");
    }

    //method to feed the dog
    public void feed(){
        if(isHungry){
            System.out.println(name + " is eating.");
            isHungry = false;
        }
        else{
            System.out.println(name + " is not hunger right now");
        }
    }

    //method to check if dog is a puppy
    public boolean isPuppy(){
        return age<1;
    }

    //method to get th dog's age
    public int getAge(){
        return age;

    }

    
}
