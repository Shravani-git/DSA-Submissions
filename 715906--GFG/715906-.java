class Solution {
    public boolean isFrequencyUnique(List<Integer> arr) {
        // code here
         HashMap<Integer,Integer> map=new HashMap<> ();
        for(int a :arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        HashSet<Integer> set= new HashSet<> ();
        for(int freq: map.values())
        {
            if(!set.add(freq))
            {
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna