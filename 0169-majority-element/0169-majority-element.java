class Solution {
    public int majorityElement(int[] nums) {
        // Current approach uses a HashMap to count frequencies.
        // It runs in O(n) time and O(n) extra space.
        // Since the problem guarantees a majority element, you can achieve O(1) space
        // using the Boyer‑Moore Voting Algorithm. Consider implementing that for a
        // more optimal solution.
        HashMap<Integer,Integer> h = new HashMap<>();
        int n= nums.length;
        int ans=-1;
        for(int i:nums){
            if(h.containsKey(i)){
                int c= h.get(i);
                c++;
                if(c>n/2){
                    ans = i;
                    break;
                }
                h.put(i,c);
            }
            else{
                h.put(i,1);
                if (1 > n / 2) {
                    ans = i;
                    break;
                }
            }
        }
        
        // The problem guarantees a majority element, so this line is never reached.
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna