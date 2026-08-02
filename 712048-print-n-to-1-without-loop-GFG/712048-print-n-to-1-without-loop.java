class Solution {
    void printNos(int n) {
        // code here
        if(n==1){
            System.out.print("1");
        }else{
            System.out.print(n+" ");
            printNos(n-1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna