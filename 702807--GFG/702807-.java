class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> h = new HashSet<>();
        String res="";
        for(char c :s.toCharArray()){
            if(h.add(c)){
                res+=c;
            }
        }
        return res;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna