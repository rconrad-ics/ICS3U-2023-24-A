package lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        exampleOne();
        //exampleTwo();
        //int result = exampleThree();
        //int result = exampleFour(10, 20);

        //int result = exampleFive(1,100);
        //int result = exampleSix(1,1000);
        //System.out.println(result);

        
    }

    private static int exampleSix(int min, int max) {
        int sum = 0;

        int i = min;

        while(i<=max){
            sum += i;
            i++;
        }

        return sum;

    }

    private static int exampleFive(int min, int max) {

        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    private static int exampleFour(int min, int max) {
        boolean isValid = false;
        int result = 0;
        Scanner in = new Scanner(System.in);

        while(!isValid){
            System.out.print("Please enter a number from " + min + " to " + max + ": ");
            
            try{
                result = Integer.parseInt(in.nextLine());
                if (result < min || result > max)
                    System.out.println("Not in the specified range.");
                else
                    isValid = true;
            }catch(NumberFormatException badThing){
                System.out.println("Numbers only!");
            }

        }

        return result;
    }

    private static int exampleThree() {
        int result = -1;
        Scanner in = new Scanner(System.in);

        //while(result <1 || result > 10){
        while(!(result >= 1 && result <= 10)){
            System.out.print("Please enter a number from 1 to 10: ");
            result = in.nextInt();
        }

        return result;
    }

    private static void exampleTwo() {
        int numEven = 0;
        for (int i = 0; i < 10000000; i++) {
            if (((int)(Math.random()*10) + 1) % 2 == 0){
                numEven++;
            }

        }

        System.out.println(numEven / (double)10000000);
    }

    private static void exampleOne() {
        /* 
        for (int i = 0; i < 1000; i++) {    // i is the counter -> call it what you want
            System.out.println(i);
        }*/
        int i = 0;
        while(i<100){
            //do something
            
            System.out.println(i);
            
        }
    }

    
}
