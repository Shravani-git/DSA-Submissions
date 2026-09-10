class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        int[] answer  = {-1,-1};
               for(int i=arr.length-2;i>=0;i--)
               {
                   if(arr[i]==arr[i+1])
                   {
                       answer[0]=i+1;
                       answer[1]=arr[i];
                       break;
                   }
               }
               return answer;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna