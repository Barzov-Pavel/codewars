package solutions;

/*
 * The aim of this kata is to split a given string into different strings of equal size
 * (note size of strings is passed to the method)
 *
 * Assumptions:
 * String length is always greater than 0
 * String has no spaces
 * Size is always positive
 */

public class InParts {
    public static void main(String[] args) {
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));
    }

    public static String splitInParts(String s, int partLength) {
        StringBuilder result = new StringBuilder();
        int startSubstring = 0;
        int endSubstring = partLength;
        if (partLength > s.length() || partLength == s.length()) {
            return s;
        } else {
            while (startSubstring < s.length()) {
                if (endSubstring < s.length()) {
                    result.append(s.substring(startSubstring, endSubstring)).append(" ");
                    startSubstring += partLength;
                    endSubstring += partLength;
                } else {
                    result.append(s.substring(startSubstring));
                    startSubstring += partLength;
                }
            }
        }
        return result.toString();
    }
}
