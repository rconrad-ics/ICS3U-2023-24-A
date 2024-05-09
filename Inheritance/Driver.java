package Inheritance;

public class Driver {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        Android a = new Android(x);  // call the Android 1 arg constructor
        a.setServoCount(y);
        System.out.println(a.getServoCount());
    }
}
