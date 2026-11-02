class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        

                HashMap<Integer, Integer> map = new HashMap<>();
                ArrayList<Integer> result = new ArrayList<>();

                // Count frequency
                for (int x : arr) {
                    map.put(x, map.getOrDefault(x, 0) + 1);
                }

                // Preserve first occurrence order
                HashSet<Integer> added = new HashSet<>();

                for (int x : arr) {
                    if (map.get(x) > 1 && !added.contains(x)) {
                        result.add(x);
                        added.add(x);
                    }
                }

                if (result.isEmpty()) {
                    result.add(-1);
                }

                return result;
           
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna