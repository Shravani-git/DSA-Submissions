class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        char[] a= new char[26];
        int oddCount=0;
        for(char c:s.toCharArray()){
            a[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]%2!=0){
                oddCount++;
            }
        }
        if(oddCount>1){
            return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna