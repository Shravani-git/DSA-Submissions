class Solution {
    public boolean sumOfRowCol(int[][] mat) {
        // code here
        int n=mat.length;//number of row
                int m=mat[0].length;
                int range=Math.min(n,m);
                for(int i=0; i<range;i++){
                    int row_sum=0;
                    int col_sum=0;
                    for(int col=0; col<m; col++){
                        row_sum+=mat[i][col];
                    }
                    for(int row=0; row<n;row++){
                        col_sum+=mat[row][i];

                    }
                    if(row_sum!=col_sum){
                        return false;
                    }
                }
                return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna