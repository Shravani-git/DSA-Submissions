class Solution {
    public int sequence(int n) {
        // code here
       
        
        
        long ct=1;
        long sum=0;
        long temp=1;
        long number=1;
        while(number<=n)
        {
            for(int i=0;i<number;i++)
            {
                temp=(ct*temp)%1000000007;
                ct++;

            }

            sum=(sum+temp)%1000000007;

           temp=1;


            number++;
        }
        return (int)sum%1000000007;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna