class Solution {
    public int sumSqEven(int n) {
        // code here
        int ans=0;
        int even =2;
        for(int i=0;i<n;i++){
            ans+=(long)Math.pow(i+even++,2);
        }
        return ans;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna