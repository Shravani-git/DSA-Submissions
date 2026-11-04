class Solution {
    public int nthGeekyNumber(int N, int[] GeekNum) {

        int K = GeekNum.length;

        if (N <= K) {
            return GeekNum[N - 1];
        }

        ArrayList<Long> list = new ArrayList<>();

        long sum = 0;

        // Store initial K numbers
        for (int i = 0; i < K; i++) {
            list.add((long) GeekNum[i]);
            sum += GeekNum[i];
        }

        // Generate remaining numbers
        for (int i = K; i < N; i++) {

            list.add(sum);

            // Remove oldest number and update sum
            sum -= list.get(i - K);

            // Add newly generated number
            sum += list.get(i);
        }

        return list.get(N - 1).intValue();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna