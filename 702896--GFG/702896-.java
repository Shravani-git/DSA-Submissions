class Solution {
    int typeOfArr(int arr[]) {
        // code here
        int n = arr.length;
        int min = 0, max = 0;

        for(int i=0;i<n;i++){
            if(arr[max] < arr[i])max = i;
            if(arr[min] > arr[i])min = i;
        }

        if(min == 0 && max == n-1) return 1;
        if(min == n-1 && max == 0) return 2;
        if(min > max) return 4;
        if(max > min) return 3;

        return 0;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna