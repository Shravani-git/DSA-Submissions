class Solution {
    ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        int mod = 1000000007;

        result.add(0);
        result.add(1);

        for (int i = 2; i <= n; i++) {
            long next = (result.get(i - 1) + (long) result.get(i - 2)) % mod;
            result.add((int) next);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna