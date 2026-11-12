class Solution {
    public boolean fourSum(int[] arr, int x) {
        // code here
        for(int i=0;i<arr.length;i++){
                    for(int j=i+1;j<arr.length;j++){
                        for(int k=j+1; k<arr.length;k++){
                            for(int m=k+1; m<arr.length;m++){
                                if(arr[i]+arr[j]+arr[k]+arr[m]==x){
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna