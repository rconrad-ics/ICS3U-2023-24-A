package lesson2;

import java.util.Scanner;

public class LoopsExamples {
    public static void main(String[] args){
        //exampleOne();
        //exampleTwo();


        //int result = exampleThree("Today is the best day Ever!");
        //System.out.println(result);


        //int result = exampleFour("codeycodehhicodew", "code");
        //System.out.println(result);


         int result = exampleFive();
         System.out.println(result);

    }
    private static void exampleOne(){
        // for loop is a counting loop and is used when we know how many times to execute
        // some code.

        // it requires 3 things:
        // what to start counting from: int i = 0;
        // condition to keep counting as it is true: i < 10;
        // how do you want to count: i++ 
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }

    private static void exampleTwo() {
        for(int i = -10; i <= 10; i+=2){
            System.out.println(i);
        }
    }

    private static int exampleThree(String str) {
        int numE = 0;
           
        for(int index = 0; index < str.length(); index++){
            String letter = str.substring(index, index+1);
           
            if ("e".equals(letter) || "E".equals(letter))
                numE++;
        }
                   
        return numE;           
            
    }
            
    private static int exampleFour(String bigStr, String smallStr) {
        int num = 0;
        
        for(int i=0; i<=bigStr.length()-smallStr.length(); i++){
            String str = bigStr.substring(i, i+smallStr.length());
                       
            if (smallStr.equals(str))
                num++;
        }
             
        return num;
            
    }
                    
        private static int exampleFive() {
            System.out.println("Please enter a number [1-10]: ");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
                            
            for(;!(num >= 1 && num <= 10);){
                System.out.println("Please enter a number [1-10]: ");
                num = in.nextInt();
            }
                   
            return num;    
                
        }

        

    }

   
   

