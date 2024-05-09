package Sorting;

public class Data {
    private static final int MAX = 1000;
    private int[][] grid = new int[4][3];

    public void repopulate(){
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                int rand = 100;
                while(rand % 100 == 0 || rand%10!=0){
                    rand = (int)(Math.random()*MAX) + 1;
                }

                grid[r][c] = rand;
                System.out.print(grid[r][c]);
            }
            System.out.println()
            
        }

    }

    public int countIncreasingColumns(){
        int count = 0;

        for (int c = 0; c < grid[0].length; c++) {
            boolean isIncreasing = true;
            for (int r = 0; r < grid.length-1; r++) {
                if (grid[r][c] > grid[r+1][c])
                    isIncreasing = false;
            }

            if (isIncreasing)
                count++;
        }

        return count;
    }

    repopulate();
}
