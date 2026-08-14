class Solution {
    static long nthPosition(long n) {
        // code here
        long position = 1;

        while (position <= n) {
            position *= 2; 
        }

        return position / 2; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna