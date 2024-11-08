package tap;

public class HackerLanguageTranslator {

    // Method to translate a character to its Hacker Language equivalent
    private static char toHackerChar(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a': return '4';
            case 'e': return '3';
            case 'i': return '1';
            case 'o': return '0';
            case 't': return '7';
            default: return c; // If not a vowel or "t", keep the character unchanged
        }
    }

    // Method to translate the given string to Hacker Language
    public static String toHackerLanguage(String input) {
        StringBuilder translated = new StringBuilder();

        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            translated.append(toHackerChar(c));  // Translate each character
        }

        return translated.toString();
    }


}
