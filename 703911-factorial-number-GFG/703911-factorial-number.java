// User function Template for Java

class Solution {
    static int isFactorial(int N) {
        // code here
        int fact=1;
        for(int i=1;i>=1;i++){
            if(fact<=N){
                fact=fact*i;
                if(fact==N) return 1;
            }
            else{
                fact=0;
                break;
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna