class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        if(arr.size()<3){
            return -1;
        }
        Collections.sort(arr);
        return arr.get(arr.size() - 3);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna