class Solution {
    int stockBuySell(int arr[]) {
        // code here
       int profit=0;
       for(int i=1;i<=arr.length-1;i++){
           if(arr[i]>arr[i-1]){
               profit=profit+(arr[i]-arr[i-1]);
           }
       }
       return profit;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna