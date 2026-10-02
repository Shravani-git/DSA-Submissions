class Solution {
    public int remainder(String s) {
        // code here
        int ans=0;
        for(int i=0;i<=s.length()-1;i++){
            ans=(ans*10+(s.charAt(i)-'0'))%11;
        }
        return ans;
    }
};
// int rem=0;

//       for(int i=0;i<x.length();i++){
//           rem=(rem * 10 +(x.charAt(i) - '0')) % 11;
//       }
//       return rem;

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna