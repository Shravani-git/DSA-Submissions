class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i=0;
        int j=k-1;
        int sum=0;
        for(int l=0;l<=j;l++){
            sum=sum+arr[l];
        }
        i++;
        j++;
        int ans=sum;
        while(j<=arr.length-1){
            sum=sum-arr[i-1];
            i++;
            sum=sum+arr[j];
            j++;
            ans=Math.max(ans,sum);
        }
        return ans;
        
        
        // int sum=0;
        // int low=0;
        // int high=k-1;
        // for (int i=low;i<=high;i++){
        //     sum+=arr[i];
        // }
        // low++;
        // high++;
        
        // int ans=sum;
        
        // while (high<arr.size()){
            
        //     sum=sum-arr[low-1]+arr[high];
        //     ans=max(sum,ans);
        //     low++;
        //     high++;
        // }
        
        // return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna