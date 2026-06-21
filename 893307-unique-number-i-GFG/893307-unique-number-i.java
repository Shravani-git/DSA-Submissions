class Solution {
    public int findUnique(int[] arr) {
        // code here
        int xor = 0;
        for(int i : arr){
            xor = xor^i;
        }
        return xor;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna