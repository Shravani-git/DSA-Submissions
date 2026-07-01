class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        int ans=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:arr){
            if(h.containsKey(i)){
                int count= h.get(i);
                h.put(i,count+1);
            }
            else{
                h.put(i,1);
            }
        }
        for(int i:h.keySet()){
            if(h.get(i)>arr.length/k){
                ans++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna