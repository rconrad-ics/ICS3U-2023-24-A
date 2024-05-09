import java.util.ArrayList;

public class ArrayListExamples{
    public static void main(String[] args){
        exampleOne();
    }

    private static void exampleOne(){
        ArrayList<String> words = new ArrayList<String>();

        words.add("hi");
        words.add("bye");

        System.out.println(words.size());

        words.add(1,"hello");
        //words.add(1,"hello");

        System.out.println(words.size());

        System.out.println(words.get(2));

        //using a FOR LOOP
        //int sum = 0;
        //for(int i=0; i<words.size();i++){
        //    sum += words.get(i).length();
        //}

        //using a foreach loop
        int sum =0;
        for(String s:words){
            sum += s.length();
        }

        System.out.println("Average words length is: "+ sum/words.size());

        //words.remove(0);

        for(String string:words){
            System.out.println(string);
        }

        //remove words of length 3 or more
        int i =0;
        for(String s:words){
            if(s.length()>2){
                words.remove(i);
            }
            i++;
        }

        

        ArrayList<Integer> integers = new ArrayList<Integer>();

        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println(integers);
        
        //This causes a crash due to removing an element while iterating through the ArrayList
        //for(Integer integer:integers){
        //    integers.remove(1);
        //}

        //System.out.println(integers);
    }
}