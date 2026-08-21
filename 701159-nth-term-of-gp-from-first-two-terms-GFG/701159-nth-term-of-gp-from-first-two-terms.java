class Solution {
    public int termOfGP(int a, int b, int n) {
        // code here
        double r = (double) b / a;
        return (int) (a * Math.pow(r, n - 1));
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna