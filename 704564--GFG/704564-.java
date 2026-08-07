class Solution {
    static long kthDigit(int a, int b, int k) {
        // code here
         long n = (long) Math.pow(a, b);
        int i = 1;
        while (i < k) {
            n = n / 10;
            i++;
        }
        return n % 10;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna