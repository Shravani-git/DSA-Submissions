class Solution {
    int countZeroes(int[] arr) {
        // code here
        int zeros=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        return zeros;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna