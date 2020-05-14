package solutions;

/*
 * Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
 * Your task is to make 'Past' function which returns time converted to milliseconds.
 */

public class Clock {
    public static int Past(int h, int m, int s) {
        return h * 60 * 60 * 1000 + m * 60 * 1000 + s * 1000;
    }
}
