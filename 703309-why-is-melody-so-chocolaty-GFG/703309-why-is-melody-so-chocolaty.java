class Solution {
    public int maxHappiness(List<Integer> arr) {
        // code here.
        int maxSum=0;
        int curSum=0;
        for(int i=1;i<=arr.size()-1;i++){
            curSum=arr.get(i-1)+arr.get(i);
            maxSum=Math.max(maxSum,curSum);
        }
        return maxSum;
    }
}
