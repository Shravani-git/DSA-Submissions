class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalSum=0;
        int leftSum=0;
        
        for(int i:arr){
            totalSum=totalSum+i;
        }
        
        for(int i=0;i<=arr.length-1;i++){
            int rightSum=totalSum-leftSum-arr[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum=leftSum+arr[i];
        }
        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna