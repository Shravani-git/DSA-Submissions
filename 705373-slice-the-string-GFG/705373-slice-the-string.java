class Solution {
    public static String sliceString(String s) {
        // code here
        String str = "";
        int strlen = s.length();
        
        if(strlen>1){
            for(int i=1;i<strlen-1;i++){
                str=str+s.charAt(i);
            }
        }
        return str;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna