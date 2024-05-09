package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //int[] arr = {5,3,9,10,11,2,-4,0,-4,-4,-1,12};

       // display(arr);
       for (int i = 1; i < 7; i++) {
            int[] arr = new int[(int)Math.pow(10,i)];
            insertionSort(arr);
            //selectionSort(arr);
            //Arrays.sort(arr);
            System.out.println("Done for size: " + (int)Math.pow(10,i));
       }
        // display(arr);
        // insertionSort(arr);
        // display(arr);


    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            for (j = i; j > 0 && temp < arr[j-1]; j--) {
                arr[j] = arr[j-1];
            }

            arr[j] = temp;
        }
    }

    private static void selectionSort(int[] arr) {
        // moves the dashed line (the division between sorted and unsorted sides)
       for (int i = 0; i < arr.length - 1; i++) {
        int smallestIndex = i;  // assume smallest is loctaed at the beginning of the unsorted side
        for (int j = i + 1; j < arr.length; j++) {  // iterate the unsorted side
            if(arr[j] < arr[smallestIndex]) // look for the smallest
                smallestIndex = j;      // update the smallest location
        }

        // swap front with the smallest
        int temp = arr[i];
        arr[i] = arr[smallestIndex];
        arr[smallestIndex] = temp;
       }
    }

    private static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
