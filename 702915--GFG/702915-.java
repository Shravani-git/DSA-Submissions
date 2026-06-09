// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
        int ans=0;
        for(int i:arr){
            ans=ans^i;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna