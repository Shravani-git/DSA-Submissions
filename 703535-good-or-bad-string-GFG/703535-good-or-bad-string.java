class Solution {
    boolean isGoodOrBad(String s) {

        // possible consecutive vowel counts
        boolean[] vowel = new boolean[6];

        // possible consecutive consonant counts
        boolean[] consonant = new boolean[4];

        vowel[0] = true;
        consonant[0] = true;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            boolean[] newVowel = new boolean[6];
            boolean[] newConsonant = new boolean[4];

            // Treat current character as a vowel
            if (ch == '?' || isVowel(ch)) {

                for (int v = 0; v <= 5; v++) {
                    if (vowel[v]) {

                        // More than 5 consecutive vowels -> BAD
                        if (v == 5) {
                            return false;
                        }

                        newVowel[v + 1] = true;
                    }
                }

                // Vowel breaks consonant streak
                for (int c = 0; c <= 3; c++) {
                    if (consonant[c]) {
                        newConsonant[0] = true;
                    }
                }
            }

            // Treat current character as a consonant
            if (ch == '?' || !isVowel(ch)) {

                for (int c = 0; c <= 3; c++) {
                    if (consonant[c]) {

                        // More than 3 consecutive consonants -> BAD
                        if (c == 3) {
                            return false;
                        }

                        newConsonant[c + 1] = true;
                    }
                }

                // Consonant breaks vowel streak
                for (int v = 0; v <= 5; v++) {
                    if (vowel[v]) {
                        newVowel[0] = true;
                    }
                }
            }

            vowel = newVowel;
            consonant = newConsonant;
        }

        return true;
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna