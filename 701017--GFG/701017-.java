class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            ans.add(Math.max(arr[i],arr[i+1]));
        }
        return ans;
    }
};