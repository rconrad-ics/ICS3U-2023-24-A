package Sorting;

public class Array2D {

        public static void main(String[] args) {
            int[][] arr2D = new int[4][3];
    
            for (int r = 0; r < arr2D.length; r++) {
                for (int c = 0; c < arr2D[r].length; c++) {
                    arr2D[r][c] = (int)(Math.random()*10)+1;
                }
            }
    
            arr2D[1] = new int[10];
    
    
            for (int r = 0; r < arr2D.length; r++) {
                for (int c = 0; c < arr2D[r].length; c++) {
                    //System.out.print(arr2D[r][c] + " ");
                    if(arr2D[r][c]==5){
                        System.out.print("Number at location: " + r + ", " + c);
                    }
                    else{
                        System.out.print("Number not found");
                    }
                }
                System.out.println();
    
            }
           System.out.println();
    
    
    
            
        }
    
}
