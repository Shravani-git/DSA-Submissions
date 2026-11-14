class Solution {
    public int sumOfGP(int n, int a, int r) {
        // code here
        long sum =0;
                for(int i=0;i<n;i++){
                    sum=sum+a;
                    a=a*r;
                }
               return (int)sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna