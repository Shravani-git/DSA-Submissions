class Solution {
    public int digitsInFactorial(int n) {
        // code here
         // code here
         if (n == 0 || n == 1)
            return 1;

        double sum = 0;

        for (int i = 2; i <= n; i++) {
            sum += Math.log10(i);
        }

        return (int)sum + 1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna