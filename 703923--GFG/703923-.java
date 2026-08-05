class Solution {
    
    int isPerfect(int N) {
        // code here
        int temp=N;
        int sum=0;
        while(N!=0){
            int digit=N%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            N=N/10;
        }
        if(temp==sum){
            return 1;
        }else{
            return 0;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna