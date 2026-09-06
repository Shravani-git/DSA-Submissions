class Solution {
    static int inSequence(int a, int b, int c) {
        // code here
        if(c==0) { 
            return a==b ? 1 : 0;
            
        }
                else 
                {
                    return (b-a)%c == 0 && (b-a)/c >= 0 ? 1 : 0;
                }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna