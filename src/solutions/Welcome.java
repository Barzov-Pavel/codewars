package solutions;

import java.util.HashMap;
import java.util.Map;

/*
 * Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries.
 * Marketing thinks it would be great to welcome visitors to the site in their own language.
 * Luckily you already use an API that detects the user's location, so this is an easy win.

 *The Task
 *Think of a way to store the languages as a database (eg an object).
 * The languages are listed below so you can copy and paste!
 *Write a 'welcome' function that takes a parameter 'language' (always a string),
 * and returns a greeting - if you have it in your database.
 * It should default to English if the language is not in the database, or in the event of an invalid input.
 */

public class Welcome {
    public static void main(String[] args) {
        System.out.println(greet("danish"));
    }

    public static String greet(String language) {
        Map<String, String> greets = getMap();
        if (greets.containsKey(language)) {
            return greets.get(language);
        } else return "Welcome";
    }

    private static Map<String, String> getMap() {
        Map<String, String> greets = new HashMap<>();
        greets.put("english", "Welcome");
        greets.put("czech", "Vitejte");
        greets.put("danish", "Velkomst");
        greets.put("dutch", "Welkom");
        greets.put("estonian", "Tere tulemast");
        greets.put("finnish", "Tervetuloa");
        greets.put("flemish", "Welgekomen");
        greets.put("french", "Bienvenue");
        greets.put("german", "Willkommen");
        greets.put("irish", "Failte");
        greets.put("italian", "Benvenuto");
        greets.put("latvian", "Gaidits");
        greets.put("lithuanian", "Laukiamas");
        greets.put("polish", "Witamy");
        greets.put("spanish", "Bienvenido");
        greets.put("swedish", "Valkommen");
        greets.put("welsh", "Croeso");
        return greets;
    }
}
