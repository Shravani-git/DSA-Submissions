class Solution {
    public int findJumps(int n, int k) {
        // code here
        long count=0;
              if(n<k){
                  return n;
              }
              long t=n/k;
              n=n%k;
             count=t+n;
             return (int)count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna