/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        int n = arr.length;
        long mod = 1000000007;
        long product = 1;
        
        for (int i = 0; i < n; i++) {
            product = (product * arr[i]) % mod;
        }
        
        return product;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna