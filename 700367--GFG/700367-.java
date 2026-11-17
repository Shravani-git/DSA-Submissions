class Solution {
    static long gcd(long a,long b){
           if (b==0) return a;
           return gcd(b,a%b);
       }
       public static long getSmallestDivNum(int n){
           // code here
           long ans=1;
           for(int i=2;i<=n;i++){
               ans=(ans*i)/gcd(ans,i);
           }
           return ans;
       }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna