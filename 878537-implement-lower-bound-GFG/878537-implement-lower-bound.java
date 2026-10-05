class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int ans = arr.length;
       
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==target || arr[i]>=target){
                ans=i;
                return ans;
            }
        }
        
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna