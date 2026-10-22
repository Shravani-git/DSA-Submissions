class Solution {
    public int minimumInteger(int[] arr) {
        // code here
       
        long sum=Arrays.stream(arr).summaryStatistics().getSum();

                int ans=Integer.MAX_VALUE;
                for(int i=0;i<arr.length;i++)
                {
                    long mul=((long)arr.length*(long)arr[i]);
                    if(sum<=mul)  ans=Math.min(ans,arr[i]);
                }

                    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna