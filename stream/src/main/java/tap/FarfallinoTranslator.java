package tap;

public class FarfallinoTranslator {

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    // Method to translate the given string to Farfallino alphabet
    public static String toFarfallino(String input) {
        StringBuilder translated = new StringBuilder();

        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // If the character is a vowel, apply Farfallino transformation
            if (isVowel(c)) {
                translated.append(c);  // Add the original vowel
                translated.append('f'); // Add 'f'
                translated.append(c);   // Add the same vowel again
            } else {
                translated.append(c);  // Add the consonant unchanged
            }
        }

        return translated.toString();
    }

}
