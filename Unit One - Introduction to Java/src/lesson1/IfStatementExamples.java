package lesson1;

public class IfStatementExamples {
    public static void main(String[] args){
        boolean isHappy = true;
        boolean hasBlueShoes = false;
        int x = 13;

        /*if(isHappy){
            System.out.println("I'm glad you are happy.");
            System.out.println("It's hard to be happy when it rains.");
        }
        System.out.println("It is raining today.");
        

        if(!hasBlueShoes){
            System.out.println("You are not wearing blue shoes.");
            System.out.println("How dare you!");
        }
        */

        if(x>0)
            System.out.println(x + " is positive");

        if(x%2==0)
            System.out.println(x + " is even.");

        if(isHappy)
            System.out.println("Happy");
    }
    
}
