class Solution {
    public int[] find(int l, int b, int h) {
        // code here
        int area=2*(l*b+b*h+l*h);
                int vol=(l*b*h);
                return new int[]{area,vol};
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna