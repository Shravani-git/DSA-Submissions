class Solution {
    public int mean(int[] arr) {
        // code here
        int N=arr.length;
        int sum = 0;
       for(int i=0;i<N;++i) {
           sum += arr[i];
       }
       return (sum / N);
    }

    public int median(int[] arr) {
        // code here
        int N=arr.length;
        Arrays.sort(arr);
       int mid = N / 2;
       if(N % 2 == 1) {
           return arr[mid];
       }
       else {
           return (arr[mid - 1] + arr[mid]) / 2;
       }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna