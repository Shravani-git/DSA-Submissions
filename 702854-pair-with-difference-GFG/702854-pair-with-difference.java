
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
          Arrays.sort(arr);
        
        int n = arr.length;
        
        int i = 0, j = 1;
        
        while (i < n && j < n) {
            
            if (i == j) {
                j++;
                continue;
            }
            
            int diff = arr[j] - arr[i];
            
            if (diff == x) {
                return true;
            }
            else if (diff < x) {
                j++;
            }
            else {
                i++;
            }
        }
        
        return false;
    
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna