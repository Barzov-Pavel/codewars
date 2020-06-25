package solutions;

/*
 * Given a positive integer n, calculate the following sum:
 * n + n/2 + n/4 + n/8 + ...
 * All elements of the sum are the results of integer division.
 */

public class HalvingSum {
    public static void main(String[] args) {
        System.out.println(halvingSum(25));
    }

    static int halvingSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + halvingSum(n / 2);
        }
    }
}
