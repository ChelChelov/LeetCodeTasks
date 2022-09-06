package leetCode;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibEffective(10));
    }

    private static long fibNaive(int n) {
        if (n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        //Initialize first two values of array
        for (int i = 2; i <= n; i++)
            //Get next indexes of array
            arr[i] = arr[i - 1] + arr[i - 2];
        //Initialize value to arr[i] until arr[i] will not be equals arr[n]
        return arr[n];
    }
}
