class Solution {
    int missingNum(int arr[]) {
    
        int n = arr.length;
        int xor=0;
        for(int i=1;i<=n+1;i++){
            xor=xor^i;
        }
        for(int i:arr){
            xor=xor^i;
        }
        return xor;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna