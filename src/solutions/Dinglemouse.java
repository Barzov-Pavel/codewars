package solutions;

/*
 * Your job is to compare two confidential documents that have come into your possession.
 * The first document has parts redacted, and the other one doesn't.
 * But the original (unredacted) document might be a fake!
 * You need to compare the two documents and decide if it is possible they are the same or not.

 * Return true if the two documents are possibly the same. Return false otherwise.

 * Notes
 * Each document is made of any visible characters, spaces, punctuation, and newlines \n
 * Any character might be redacted (except \n)
 * The redaction character is X
 * The redacted document is always the first one
 */

public class Dinglemouse {
    public static void main(String[] args) {

        String doc1 = "TOP SECRET:\nThe missile launch code for Sunday XXXXXXXXXX is:\nXXXXXXXXXXXXXXXXX";
        String doc2 = "TOP SECRET:\nThe missile launch code for Sunday 5th August is:\n7-ZERO-8X-ALPHA-1";
        System.out.println(redacted(doc1, doc2));

        String doc3 = "The name of the mole is Professor XXXXX";
        String doc4 = "The name of the mole is Professor Dinglemouse";
        System.out.println(redacted(doc3, doc4));

        String doc5 = "XXXXXXXX XXXXXXX XXXXXXXXXXXXXXXXXXX\nXXXX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX XXXXXXXXX XXXXXXXXXXXXX XXXXX";
        String doc6 = "Area-51. Medical Report. 23/Oct/1969\nE.T. subject 4 was given an asprin after reporting sick for duty today";
        System.out.println(redacted(doc5, doc6));
    }

    public static boolean redacted(String doc1, String doc2) {
        if (doc1.length() != doc2.length()) return false;
        for (int i = 0; i < doc1.length(); i++) {
            if (doc1.charAt(i) == 'X' && doc2.charAt(i) == '\n' || doc1.charAt(i) != 'X' && doc1.charAt(i) != doc2.charAt(i))
                return false;
        }
        return true;
    }
}
