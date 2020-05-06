package solutions;

/*
 * You are going to be given a word. Your job is to return the middle character of the word.
 * If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
 */

public class Kata {
    public static void main(String[] args) {
        System.out.println(getMiddle("A"));
    }

    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return String.valueOf(word.charAt(word.length() / 2 - 1)) + String.valueOf(word.charAt(word.length() / 2));
        } else {
            return String.valueOf(word.charAt(word.length() / 2));
        }
    }
}
