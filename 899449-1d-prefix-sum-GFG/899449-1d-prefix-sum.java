class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int psum=0;
        ArrayList<Integer> preSum = new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++){
            psum=psum+arr[i];
            preSum.add(i,psum);
        }
        return preSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna