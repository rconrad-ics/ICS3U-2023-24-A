package Sorting;


public class Recursion {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }
    static long[] solutions = new long[51];
    private static long fibRec(int n) {
        if (n == 1 || n == 2)
            return 1;
        else if(solutions[n]!= 0)
            return solutions[n];
        else {
            solutions[n] = fib(n-2) + fib(n-1);
            return solutions[n];
        }

    }

    private static long fib(int n) {

        solutions[1] = 1;
        solutions[2] = 1;
        for (int i = 3; i < solutions.length; i++) {
            solutions[i] = solutions[i-1] + solutions[i-2];
        }

        return solutions[n];

    }

    // private static int factorial(int n) {
    //     if (n == 1 || n == 0)
    //         return 1;
    //     else if(solutions[n]!= 0)
    //         return solutions[n];
    //     else
    //         return n * factorial(n-1);
    // }


}
