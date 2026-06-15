// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        HashSet<Character> h = new HashSet<>();
        for(char ch:s.toCharArray()){
            if(!h.add(ch)){
                return Character.toString(ch);
            }
        }
        return "-1";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna