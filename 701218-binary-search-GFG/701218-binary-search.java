class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
         ArrayList<Integer> arrlst=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            arrlst.add(arr[i]);
        }
        
        return arrlst.contains(k);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna