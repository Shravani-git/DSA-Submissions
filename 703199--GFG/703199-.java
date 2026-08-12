class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        int n = arr.length;
        if(n<1){
            return "";
        }
        if(n==1){
            return arr[0];
        }
        String ans = "";
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[n-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i) == last.charAt(i)){
                ans=ans+first.charAt(i);
            }
            else{
                break;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna