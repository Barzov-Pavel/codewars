package solutions;

public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    /*
     * Create array with vowels, create array with checked string, compare them and
     * if vowel find skip iteration,
     * else save Consonant to result array
     */

    public static String disemvowel(String str) {
        char[] vowels = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        char[] checkedStr = str.toCharArray();
        char[] temporaryResult = new char[str.length()];
        int lengthTemporaryResultArray = 0;
        int countConsonants = 0;

        outer:
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (checkedStr[i] == vowels[j]) {
                    continue outer;
                } else if (j == vowels.length - 1) {
                    temporaryResult[lengthTemporaryResultArray] = checkedStr[i];
                    lengthTemporaryResultArray++;
                    countConsonants++;
                }
            }
        }

        // delete null from temporaryResult array
        char[] result = new char[countConsonants];
        for (int i = 0; i < countConsonants; i++) {
            result[i] = temporaryResult[i];
        }
        return String.valueOf(result);
    }
}
