class Solution {
    public static boolean isLucky(int n) {
        // code here
        int counter = 2;
		int remaining = n;
		while (counter <= remaining) {
			if (remaining % counter == 0) {
				return false;
			}
			else {
				remaining = remaining - (int) Math.floor(remaining / counter);
			}
			counter++;
		}
		return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna