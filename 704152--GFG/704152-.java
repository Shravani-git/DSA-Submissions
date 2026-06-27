
class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int count=0;
        for(int i=0;i<=n;i++){
            String numStr = Integer.toString(i);
            if(numStr.contains("4")){
                count++;
            }
        }
        return count;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna