class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int ans = arr.length;
              int start = 0;
              int end = arr.length - 1;

              while (start <= end) {
                  int mid = start + (end - start) / 2;

                  if (arr[mid] <= target) {
                      start = mid + 1;
                  } else {
                      ans = mid;
                      end = mid - 1;
                  }
              }

              return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna