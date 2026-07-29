class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
         int l=Integer.MAX_VALUE, i1=-1,i2=-1;
         for(int i=0;i<=arr.length-1;i++){
             if(arr[i]==x){
                 i1=i;
             }
             if(arr[i]==y){
                 i2=i;
             }
             if(i1!=-1 && i2!=-1){
                 l=Math.min(l,Math.abs(i1-i2));
             }
         }
         return l==Integer.MAX_VALUE ? -1 :l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna