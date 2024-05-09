package Sorting;

import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        // int[] arr = {5, 7, -1, 0, -4, -4, 4, 98, 23, -7};

        // display(arr);
        //  insertionSort(arr);
        // display(arr);

        for (int i = 1; i < 15; i++) {
            int[] arr = new int[(int)Math.pow(10,i)];
            insertionSort(arr);
            //selectionSort(arr);
            // Arrays.sort(arr);
            System.out.println("Done for size: " + (int)Math.pow(10,i));
       }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = temp;
        }
    }

    private static void selectionSort(int[] arr) {
        // look for the smallest and swap with index i
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;      // assume smallest is at front of unsorted
            for (int j = i + 1; j < arr.length; j++) {  // find the smallest
                if(arr[j] < arr[smallestIndex])
                    smallestIndex = j;
            }

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
