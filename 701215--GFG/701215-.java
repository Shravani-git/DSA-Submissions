class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum = arr[0];
        int maxSum = arr[0];
        for ( int end = 1 ; end < arr.length ; end++ ) {
            sum = Math.max(sum+arr[end], arr[end]);
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
