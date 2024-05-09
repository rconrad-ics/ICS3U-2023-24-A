package FRQ;

public class Steptracker {
    private int minSteps;
    private int numActiveDays;
    private int numDays;
    private int totalSteps;

    public StepTracker(int minSteps){
        this.minSteps = minSteps;
        numActiveDays = 0;
        numDays = 0;
        totalSteps = 0;
    }
 
    public int activeDays(){
        return numActiveDays;
    }

    public double averageSteps(){
        if (numDays == 0)
            return 0.0;
        return totalSteps / (double) numDays;
    }

    public void addDailySteps(int steps){
        totalSteps += steps;
        if (steps >= minSteps)
            numActiveDays++;
        numDays++;
    }
}
