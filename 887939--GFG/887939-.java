class Solution {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int number) {
        // code here
        int sqrsum=0;
               for(int i=1;i<=number;i++){

                   sqrsum+=i*i;
               }
               return sqrsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna