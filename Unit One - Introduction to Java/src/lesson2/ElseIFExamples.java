package lesson2;

public class ElseIFExamples {
    public static void main(String[] args){
        boolean isHappy = true;

        if(isHappy)
            System.out.println("Kids are happy on Halloween.");
        if(!isHappy)
            System.out.println("I am sorry you aren't happy on Halloween.");


        int mark = 73;
        if(mark>=80)
            System.out.println("A");
        else if(mark>=70)
            System.out.println("B");
        else if(mark>=60)
            System.out.println("C");
        else if(mark>=50)
            System.out.println("D");
        else
            System.out.println("F");
    }
    }
    
}
