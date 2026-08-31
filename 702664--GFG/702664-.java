class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        Vector<Integer> ans = new Vector<>();

        // Convert array to Vector
        for (int num : arr) {
            ans.add(num);
        }

        // Add 1
        for (int i = ans.size() - 1; i >= 0; i--) {

            if (ans.get(i) < 9) {
                ans.set(i, ans.get(i) + 1);
                return ans;
            }

            ans.set(i, 0);
        }

        // Example: 999 -> 1000
        ans.add(0, 1);

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna