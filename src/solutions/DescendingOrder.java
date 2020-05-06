package solutions;

import java.util.Arrays;

/*
 * Your task is to make a function that can take any non-negative integer as a argument
 * and return it with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 */

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(167));
    }

    public static int sortDesc(final int num) {
        int number = num;
        int count = countNumerals(number);
        int result = 0;

        // Split int num and save numerals
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        // Sort array
        Arrays.sort(digits);
        // Create new int where numerals descending
        for (int i = count - 1; i > -1; i--) {
            result += digits[i];
            if (i != 0) {
                result *= 10;
            }
        }
        return result;
    }

    // Count quantity of numerals in int
    public static int countNumerals(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
