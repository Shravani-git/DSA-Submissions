class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i : arr) {
            if (h.containsKey(i)) {
                h.put(i, h.get(i) + 1);
            } else {
                h.put(i, 1);
            }
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= arr.length; i++) {

            if (!h.containsKey(i)) {
                missing = i;
            } 
            else if (h.get(i) > 1) {
                repeating = i;
            }
        }

        ans.add(repeating);
        ans.add(missing);

        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna