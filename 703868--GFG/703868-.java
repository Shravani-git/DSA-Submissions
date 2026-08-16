class Solution {
    static int cubeRoot(int n) {
        // code here
        int i = 1;
        while ( i * i * i <= n) i++;
        return i - 1;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna