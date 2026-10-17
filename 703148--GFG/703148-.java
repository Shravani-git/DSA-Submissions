class Solution {
    String reverses(String s) {
        // your code here
        
                int j = s.length() - 1, i = 0;
                StringBuilder res = new StringBuilder();

                while (i < s.length()) {
                    if (s.charAt(i) != ' ') {
                        while (j >= 0 && s.charAt(j) == ' ') {
                            j--;
                        }
                        res.append(s.charAt(j));
                        j--;
                    } else {
                        res.append(' ');
                    }
                    i++;
                }
                return res.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna