import.java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num){
        digitList = new ArrayList<integer>();

        if(num==0){
            digitList.add(0);
        }

        while(num>0){
            digitList.add(0,num%10)
            num /= 10;
        }
        

    }

   
    
}
