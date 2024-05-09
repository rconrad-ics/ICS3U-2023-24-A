package UsingObjects.Lesson3;

public class RandomMethodExample {
    public static void main(String[] args){
        /*for(int i=0; i< 15; i++){
           System.out.println((int)(Math.random()*10)+1);
           //System.out.println(i);
        }*/

       /* for(int i=0; i<25; i++){
            System.out.println((int)(Math.random()*21-10));
        }*/

        int lowerBound = 10;
        int upperBound = 35;
        //upperBound-lowerBound+1 => number of possible random numbers

        for(int i=0; i<15; i++){
            System.out.println(((int)(Math.random()*(upperBound-lowerBound+1))+lowerBound));
        }
        



        String one = "ABC123";
        String two = "C";
        String three = "3";
        System.out.println(one.indexOf(two));
        System.out.println(one.indexOf(three));
        System.out.println(two.indexOf(one));


        System.out.println(two.compareTo("c"));
    }
}
