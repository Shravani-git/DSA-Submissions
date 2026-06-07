class Solution {
    public ArrayList<Integer> printPat(int n) {
        // write code here
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=n; i>0; i--){
            int temp = n;
            for(int j=1; j<=n*i; j++){
                a.add(temp);
                if(j%i == 0) temp--;
            }
            a.add(-1);
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna