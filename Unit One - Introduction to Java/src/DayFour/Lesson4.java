package DayFour;

public class Lesson4 {
    public static void main(String{} args){
        int mark1 = 84, mark2 = 91, mark3 = 97;
        int NumTests = 3;

        double average = (mark1 + mark2 + mark3) / (double)numTests;
       // double average = (double)(mark1 + mark2 + mark3) / numTests;
        //brackets come first, casting comes second in order of operations

       // double average = (mark1 + (double)mark2 + mark3)/numTests;
        
        //double average = (double)((mark1+mark2+mark3)/numTests) //cast happens too late

        System.out.println(average);

        //cast int -> double we get more precision (widening conversion)
    }
}
