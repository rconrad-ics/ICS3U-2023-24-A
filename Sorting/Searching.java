package Sorting;

public class Searching {
    public static void main(String[] args) {
        int[] arr = new int[25];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        display(arr);

        int index = binarySearch(arr, 12);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == val)
                return mid;
            else if (arr[mid] < val) 
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    private static int sequentialSearch(int[] arr, int val) {
       for (int i = 0; i < arr.length; i++) {
        if (arr[i] == val)
            return i;
       }

       return -1;
    }

    private static void display(int[] arr) {
        for (int i : arr) {
           System.out.print(i + " ");
        }

        System.out.println();
    }
}