class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        map.put(0, -1); // important edge case
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (map.containsKey(sum - target)) {
                result.add(map.get(sum - target) + 2);
                result.add(i+1);
                return result;
            }
            
           if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        
        result.add(-1);
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna