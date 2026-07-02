class Solution {
    public int firstNonRepeating(int[] arr) {
        // code here
         HashMap<Integer,Integer> map=new HashMap<> ();
        for( int s :arr) {
            map.put(s,map.getOrDefault(s,0)+1);
          }
        for(int s :arr)
        {
            if(map.get(s)==1)
            {
                return s;
            }
        }
        return 0;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna