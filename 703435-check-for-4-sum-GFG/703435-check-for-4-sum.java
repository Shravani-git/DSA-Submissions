
import java.util.*;

class Solution {
    public boolean fourSum(int[] arr, int x) {
        int n = arr.length;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {

                HashSet<Integer> set = new HashSet<>();

                for (int k = j + 1; k < n; k++) {

                    int required = x - arr[i] - arr[j] - arr[k];

                    if (set.contains(required)) {
                        return true;
                    }

                    set.add(arr[k]);
                }
            }
        }

        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna