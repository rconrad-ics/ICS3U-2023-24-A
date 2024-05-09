package Inheritance;

public class Android extends Robot{
    private int servoCount;

    public Android(int initVal){
        setServoCount(initVal); // Java implicitly calls the parent (Robot) no-arg constructor
    }

    public int getServoCount(){
        return super.getServoCount();
    }

    public int getLocal(){
        return servoCount;
    }

    public void setServoCount(int in){
        super.setServoCount(in);
    }

    public void setLocal(int in){
        servoCount = in;
    }
}
