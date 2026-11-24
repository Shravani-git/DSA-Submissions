class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int n= mat.length;
                int m= mat[0].length;
                if(n==0){
                    return new int[0];
                }
                int[]columnSums = new int[m];
                for(int j =0;j<m;j++){
                    int currentColumnSum = 0;
                for(int i = 0;i<n;i++){
                    currentColumnSum+=mat[i][j];
                }
                columnSums[j]=currentColumnSum;
                }
                return columnSums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna