class Solution {
    public ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
       TreeSet<Integer> set = new TreeSet<>();

             for(int n : a) 
                 set.add(n);

             for(int n : b)
                 set.add(n);

             return new ArrayList<>(set);
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna