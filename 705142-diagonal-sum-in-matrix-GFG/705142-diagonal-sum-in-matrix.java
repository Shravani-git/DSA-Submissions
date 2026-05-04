

class Solution {
    public int diagonalSum(int[][] mat) {
        // code here
        int sum=0;
        int n= mat.length;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=mat[i].length-1;j++){
                if(i==j ){
                    sum = sum+mat[i][j];
                }
                if( i+j==n-1){
                    sum = sum+mat[i][j];
                }
            }
        }
        return sum;
    }
}