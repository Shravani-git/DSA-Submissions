class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
       
        if(s1.length()!=s2.length()){
            return false;
        }
        int count=0;
        int[] a = new int[26];
        int[] b = new int[26];
        for(char c:s1.toCharArray()){
            a[c-'a']++;
        }
        for(char c:s2.toCharArray()){
            b[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]>b[i]){
                count+=a[i]-b[i];
            }
        }
        return (count<=k);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna