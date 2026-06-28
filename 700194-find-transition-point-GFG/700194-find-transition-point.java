class Solution {
    int transitionPoint(int arr[]) {
        // code here
        if(arr[0]==1){
            return 0;
        }
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna