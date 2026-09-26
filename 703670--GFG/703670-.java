class Solution {
    public int findDiff(int[] arr) {
        // code here
        HashMap<Integer , Integer> map = new HashMap<>();

               for(int i : arr){

                   map.put(i , map.getOrDefault(i , 0) + 1);
               }
               if(map.size() == 1) return 0;

               int minFreq = Integer.MAX_VALUE;
               int maxFreq = Integer.MIN_VALUE;

               for(int freq : map.values()){

                   minFreq = Math.min(minFreq , freq);
                   maxFreq = Math.max(maxFreq , freq);
               }
               return maxFreq - minFreq;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna