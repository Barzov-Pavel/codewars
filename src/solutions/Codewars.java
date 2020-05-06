package solutions;
/*
 * Given a list of numbers, determine whether the sum of its elements is odd or even.
 * Give your answer as a string matching "odd" or "even".
 * If the input array is empty consider it as: [0] (array with a zero).
 */

public class Codewars {
    public static void main(String[] args) {
        int[] test = {0, -1, -5};
        System.out.println(oddOrEven(test));
    }

    public static String oddOrEven(int[] array) {
        int arraySum = 0;
        // get sum of numbers in array
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        // check got number
        if (arraySum % 2 == 0) {
            return "even";
        } else return "odd";
    }
}
