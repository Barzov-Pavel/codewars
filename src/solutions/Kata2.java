package solutions;

/*
 * Given three integers a ,b ,c,
 * return the largest number obtained after inserting the following operators and brackets: +, *, ()
 * In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained
 */

public class Kata2 {
    public static void main(String[] args) {
        System.out.println(expressionsMatter(1, 2, 3));
    }

    public static int expressionsMatter(int a, int b, int c) {
        int max = 0;
        if (a * b * c > max) {
            max = a * b * c;
        }
        if (a + b + c > max) {
            max = a + b + c;
        }
        if (a + b * c > max) {
            max = a + b * c;
        }
        if (a * b + c > max) {
            max = a * b + c;
        }
        if ((a + b) * c > max) {
            max = (a + b) * c;
        }
        if (a * (b + c) > max) {
            max = a * (b + c);
        }
        return max;
    }
}
