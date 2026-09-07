class Solution {
    boolean isPowerOfFour(int n) {
        // code here
        if(n==1){
            return true;
        }
        if(n%4!=0||n<=3){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna