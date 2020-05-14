package solutions;

/*
 * Given the triangle of consecutive odd numbers:

 *              1
 *           3     5
 *        7     9    11
 *    13    15    17    19
 * 21    23    25    27    29

 * Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
 */

public class RowSumOddNumbers {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(2));
    }

    public static int rowSumOddNumbers(int n) {
        int result = 0;
        int amountOddNumbers = 0;
        // count odd numbers in rows before necessary
        for (int i = 1; i < n; i++) {
            amountOddNumbers += i;
        }
        // startNumber initialize with first number for sum
        // count of numbers in row get from parameters of function
        for (int startNumber = amountOddNumbers * 2 + 1, j = 0; j < n; j++, startNumber += 2) {
            result += startNumber;
        }
        return result;
    }
}
