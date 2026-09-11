class Solution {
    public ArrayList<Integer> addFraction(int num1, int den1, int num2, int den2) {
        // code here
        int numerator = num1 * den2 + num2 * den1;
                int denominator = den1 * den2;

                // Find GCD
                int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));

                // Simplify the fraction
                numerator /= gcd;
                denominator /= gcd;

                // Return answer
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(numerator);
                ans.add(denominator);

                return ans;
            }

            private int findGCD(int a, int b) {
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna