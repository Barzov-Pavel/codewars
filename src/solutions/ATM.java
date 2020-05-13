package solutions;

/*
 * There is enough money available on ATM in nominal value 10, 20, 50, 100, 200 and 500 dollars.
 * You are given money in nominal value of n with 1<=n<=1500.
 * Try to find minimal number of notes that must be used to repay in dollars, or output -1 if it is impossible.
 */

public class ATM {
    public static void main(String[] args) {
        System.out.println(solve(770));
    }

    public static int solve(int n) {
        int balance = n;
        int numberNotes = 0;
        if (n < 10) {
            return -1;
        } else {
            numberNotes += balance / 500;
            balance %= 500;
            numberNotes += balance / 200;
            balance %= 200;
            numberNotes += balance / 100;
            balance %= 100;
            numberNotes += balance / 50;
            balance %= 50;
            numberNotes += balance / 20;
            balance %= 20;
            numberNotes += balance / 10;
            balance %= 10;
            if (balance != 0) {
                return -1;
            } else {
                return numberNotes;
            }
        }
    }
}
