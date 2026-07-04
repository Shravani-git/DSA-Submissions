class Solution {
    public int[] prefixAvg(int[] arr) {
        // code here
        int[] ans=new int[arr.length];
        int psum=0;
        for(int i=0;i<=arr.length-1;i++){
            psum=psum+arr[i];
            ans[i]=psum/(i+1);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna