class Solution {
    public boolean isPossible(int[] arr) {
        // code here
        int sum = 0;
               for(int i = 0; i < arr.length; i++) {
                   int it = arr[i];
                   while(it > 0) {
                       sum += it % 10;
                       it /= 10;
                   }
               }
               return sum % 3 == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna