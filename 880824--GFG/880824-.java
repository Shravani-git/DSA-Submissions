class Solution {
    public void reverseArray(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
				for (int i : arr) {
					stack.push(i);
				}
				int idx = 0;
				while (!stack.empty()) {
					arr[idx++] = stack.pop();
				}
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna