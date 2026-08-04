class Solution {
      static int reverse(int n){
        int num=0;
        int temp=n;
        while(n!=0){
            int digit=n%10;
            num=num*10+digit;
            n=n/10;
        }
        return num;
        }
        static boolean isPalindrome(int n){
            if(n==reverse(n)){
                return true;
            }
            return false;
        }
        
    static int isSumPalindrome(int n) {
        // code here
      if (isPalindrome(n))
        return n;
        for (int i = 0; i < 5; i++) {
            n = n + reverse(n);

            if (isPalindrome(n))
                return n;
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna