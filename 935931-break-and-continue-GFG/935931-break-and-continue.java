import java.util.*;

class Solution {
    public ArrayList<Integer> printNumbers(int n) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 7 == 0) {
                break;
            }

            if (i % 3 == 0) {
                continue;
            }

            res.add(i);
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna