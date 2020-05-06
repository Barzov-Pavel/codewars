package solutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 * Write a function which takes a list of strings and returns each line prepended by the correct number.
 * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
 */

public class LineNumbering {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("a");
        test.add("b");
        test.add("c");
        System.out.println(number(test));
    }

    public static List<String> number(List<String> lines) {
        int prefix = 0;
        List<String> modifiedLines = new ArrayList<>();
        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext()) {
            ++prefix;
            modifiedLines.add("" + prefix + ": " + iterator.next());
        }
        return modifiedLines;
    }
}
