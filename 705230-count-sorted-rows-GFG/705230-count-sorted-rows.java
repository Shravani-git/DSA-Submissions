class Solution {
    public int sortedCount(int[][] mat) {
        int n=mat.length;
        int res=0;
        int m=mat[0].length;
        for(int i=0;i<=n-1;i++){
            int count=0;
            for(int j=0;j<m-1;j++){
                if(mat[i][j]<mat[i][j+1]){
                    count++;
                }
                else if(mat[i][j]>mat[i][j+1]){
                    count--;
            }
            }
            if(Math.abs(count)==m-1){
            res++;
        }
        }
        return res;
    
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna