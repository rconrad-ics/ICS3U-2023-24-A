package DayThree;

public class ExampleOne {
    public static void main(String[] args){
      int money = 1595;
      int toonie = 200;
      int loonie = 100;
      int quarter = 25;
      int dime = 10;
      int nickel = 5;
      int x = money%toonie;
      int y = money/toonie;
      System.out.println(x); 
      System.out.println("Toonie: " + y);
      money = x;
      x = money%loonie;
      y = money/loonie;
      System.out.println(x); 
      System.out.println("Loonie: " + y);
      money = x;
      x = money%quarter;
      y = money/quarter;
      System.out.println(x); 
      System.out.println("Quarter: " + y);
      money = x;
      x = money%dime;
      y = money/dime;
      System.out.println(x); 
      System.out.println("Dime: " + y);
      money = x;
      x = money%nickel;
      y = money/nickel;
      System.out.println(x); 
      System.out.println("Nickel: " + y);

    }
    
}
