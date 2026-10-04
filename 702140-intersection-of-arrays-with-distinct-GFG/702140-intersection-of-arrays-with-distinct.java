class Solution {
    public ArrayList<Integer> findIntersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        for(int i:b){
            h.add(i);
        }
        for(int i:a){
            if(h.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna