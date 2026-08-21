class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int i=2;
        while(n>=i){
            if(n%i==0) n=n/i;
            else i++;
        }
        return i;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna