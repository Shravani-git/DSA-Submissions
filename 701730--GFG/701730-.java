class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> h = new HashSet<>();
        for(int i:a){
            h.add(i);
        }
        for(int i:b){
            h.add(i);
        }
        ArrayList<Integer> ans = new ArrayList<>(h);
        Collections.sort(ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna