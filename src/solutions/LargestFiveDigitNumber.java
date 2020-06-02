package solutions;

/*
 * Complete the solution so that it returns the greatest sequence of five consecutive digits
 * found within the number given.
 * The number will be passed in as a string of only digits.
 * It should return a five digit integer. The number passed may be as large as 1000 digits.
 */

public class LargestFiveDigitNumber {
    public static void main(String[] args) {
        System.out.println(solve("283910"));
        System.out.println(solve("1234567890"));
    }

    public static int solve(final String digits) {
        int max = 0;
        for (int i = 0, length = digits.length() - 4; i < length; i++) {
            int temporary = 0;
            for (int j = i; j < i + 5; ) {
                temporary += Integer.parseInt(digits.valueOf(digits.charAt(j)));
                j++;
                if (j != i + 5) {
                    temporary *= 10;
                }
            }
            if (temporary > max) {
                max = temporary;
            }
        }
        return max;
    }
}
