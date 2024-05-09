package DayOne.Lesson6;

public class BayviewGlenPools {
    public static void main(String[] args) {
        int length = 20;
        int shallowLength = 5;
        int transition = 7;
        int shallowHeight = 3;
        int deepHeight = 8;
        int width = 8;

        int linerCost = 2;
        // test a git commit --amend
        int shallowSideWallArea = shallowHeight * shallowLength;
        int shallowVolume = shallowSideWallArea * width;

        int transitionHeight = deepHeight - shallowHeight;
        double transitionBaseLength = Math.sqrt(transition * transition - transitionHeight * transitionHeight);
        double transitionSideWallArea = 0.5 * transitionBaseLength * transitionHeight;
        double transitionVolume = (transitionSideWallArea + (shallowHeight * transitionBaseLength)) * width;

        double deepEndSideArea = deepHeight * (length - shallowLength - transitionBaseLength);
        double deepEndVolume = deepEndSideArea * width;

        double volume = deepEndVolume + shallowVolume + transitionVolume;

        double surfaceAreaBotton = (shallowLength + transition + (length - shallowLength - transitionBaseLength)) * width;
        double totalSideSurfaceArea = (deepEndSideArea + transitionSideWallArea + shallowSideWallArea + (shallowHeight * transitionBaseLength)) * 2;
        double backFrontSurfaceArea = width * (shallowHeight + deepHeight);

        double totalSurfaceArea = surfaceAreaBotton + totalSideSurfaceArea + backFrontSurfaceArea;
        
        System.out.println("90% of the Volume is: " + volume * 0.9);
        System.out.println("Surface Area is: " + totalSurfaceArea);
        System.out.println("Cost of the liner is: $" + totalSurfaceArea * linerCost);
    }
}