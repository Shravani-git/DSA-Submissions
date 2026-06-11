class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
          HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        
        for(int i=0; i< a.length; i++){
            set1.add(a[i]);
        }
        for(int j=0; j<b.length; j++){
            if(set1.contains(b[j])){
                set2.add(b[j]);
            }
        }
         for(int k=0; k<c.length; k++){
            if(set2.contains(c[k])){
                ans.add(c[k]);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(ans);
        Collections.sort(list);
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna