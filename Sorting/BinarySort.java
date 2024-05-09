package Sorting;

import java.util.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[50];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100 -50);
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }

       int index = binarySearch(arr, 37, 0, arr.length-1);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int findMe, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high)
            return -1;
        else if (arr[mid] == findMe)
            return mid;
        else if (arr[mid] > findMe)
            return binarySearch(arr, findMe, low, mid-1);
        else
            return binarySearch(arr, findMe, mid+1, high);

    }
}