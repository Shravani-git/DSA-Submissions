class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i:nums){
            if(h.contains(i)){
                ans.add(i);
            }
            else{
                h.add(i);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna