// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        for(int i=0;i<=arr.length-1;i++){
            if(i==0 && arr[i]>arr[i+1] || arr[i]>arr[i+1] && arr[i-1]<arr[i]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna