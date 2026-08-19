class Solution {
    public ArrayList<Integer> gfSeries(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);

         if (n == 1) {
             return ans;
         }

         ans.add(1);
        for(int i=2;i<n;i++){
            int k=(ans.get(i-2)*ans.get(i-2))-ans.get(i-1);
            ans.add(k);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna