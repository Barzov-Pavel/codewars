package solutions;

import java.util.Arrays;

/*
 * Implement a function, multiples(m, n), which returns an array of the first m multiples of the real number n.
 * Assume that m is a positive integer.
 * Ex.
 * multiples(3, 5.0)
 * should return
 * [5.0, 10.0, 15.0]
 */

public class Kata3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiples(3, 5)));
    }

    public static int[] multiples(int m, int n) {
        int forAdd = n;
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[i] = n;
            n = n + forAdd;
        }
        return result;
    }
}
