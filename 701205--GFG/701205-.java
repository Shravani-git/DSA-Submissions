class Solution {
    public void rearrange(int arr[]) {
        // code here
        int n = arr.length;

               Arrays.sort(arr); // sorted input 

int maxIdx = n - 1, minIdx = 0;

      int maxElem = arr[n - 1] + 1; 
      for(int i=0;i<n;i++){
          if(i%2==0){
              arr[i]+=(arr[maxIdx]%maxElem)*maxElem;
              maxIdx--;
          }
          else{
              arr[i]+=(arr[minIdx]%maxElem)*maxElem;
              minIdx++;
          }
      }
      for (int i = 0; i < n; i++) {

                  arr[i] /= maxElem;

              }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna