class Solution {
    public int sumOfAP(int n, int a, int d) {
        // code here
        int sum =a;
        for(int i=1;i<n;i++){
            sum = sum + (a + i*d);
        }
        return sum;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna