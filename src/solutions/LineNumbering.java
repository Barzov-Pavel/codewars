package solutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
