public class Die {
    private int numSides;
    private int topSide;

    /*we can have multiple constructors/methods with the same name as long 
    as they have different argument lists */

    public Die(int numSides){
        this.numSides = numSides;
        roll();
    }

    public Die(){
        numSides = 6;
        roll();
    }

    /*
    postcondition: Create a new Die with numSides and sets topSide to topSide
    precondition: topSide <= numSides
    */

    public Die(int numSides, int topSide){
        if (topSide>numSides)
            throw new IllegalArgumentException("Topside cannot be larger than " + numSides);
        this.numSides = numSides;
        this.topSide = topSide;
        
    }

    //Mutator methos change the state of an object/instance

    public void roll(){
        topSide = (int)(Math.random()*numSides)+1;
    }

    //Mutator method to change the state

    public void setTopSide(int topSide){
        if (topSide>numSides)
            throw new IllegalArgumentException("Topside cannot be larger than " + numSides);
        this.topSide = topSide;
    }

    //accessor methods return/retrieve the state of one or more attributes
    public int getTopSide(){
        return topSide;
    }
}
