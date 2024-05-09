package Inheritance;

public class Robot {
    private int servoCount;

    public Robot(){
        System.out.println("Test");
    }

    public int getServoCount(){
        return servoCount;
    }

    public void setServoCount(int in){
        servoCount = in;
    }
}
