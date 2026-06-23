class Solution {
    public int tribonacci(int n) {
        int[] Dp = new int[n+1];
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        Dp[0]=0;
        Dp[1]=1;
        Dp[2]=1;
        for(int i=3;i<=n;i++){
            Dp[i]=Dp[i-1]+Dp[i-2]+Dp[i-3];
        }
        return Dp[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna