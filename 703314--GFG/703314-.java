class Solution {
    int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;

        int option1 = arr[n-1] * arr[n-2] * arr[n-3];
        int option2 = arr[0] * arr[1] * arr[n-1];

        return Math.max(option1, option2);
       

    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna