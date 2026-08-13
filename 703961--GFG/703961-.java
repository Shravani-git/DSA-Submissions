class Solution {
    static int closestNumber(int n, int m) {
        // code here
        int q = Math.floorDiv(n, m);

        // First possible multiple
        int n1 = m * q;

        // Second possible multiple (next one)
        int n2 = m * (q + 1) ;

        // Compare which is closer to n
        if (Math.abs(n - n1) < Math.abs(n - n2)){
            return n1;
       } else if (Math.abs(n - n2) < Math.abs(n - n1)){
            return n2;
       }
        else{
            // If both are equally close, return the one with greater absolute value
            return (Math.abs(n1) > Math.abs(n2)) ? n1 : n2;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna