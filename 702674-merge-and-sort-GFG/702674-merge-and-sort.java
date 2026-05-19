class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
        
        HashSet<Integer> h =new HashSet<>();
        for(int i=0;i<=arr1.length-1;i++){
            h.add(arr1[i]);
        }
        for(int i=0;i<=arr2.length-1;i++){
            h.add(arr2[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>(h);
        Collections.sort(ans);
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna