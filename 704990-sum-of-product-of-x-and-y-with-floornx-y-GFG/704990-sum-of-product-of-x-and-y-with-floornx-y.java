class Solution {
    public int sumofproduct(int n) {
        // code here
        int up = n;
                int low = 1;
                long sum =0;
                for(int i=0;i<n;i++)
                {
                    sum= sum+(int)Math.floor(up/low)*low;
                    //up--;
                    low++;
                }
                return (int)sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna