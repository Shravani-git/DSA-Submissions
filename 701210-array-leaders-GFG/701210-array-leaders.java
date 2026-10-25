class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
          ArrayList<Integer> list = new ArrayList<>();
       int maxFromRight = 0;
      for(int i = arr.length -1; i >= 0 ; i--){
         
         if(arr[i] >= maxFromRight){
             list.add(arr[i]);
             maxFromRight = arr[i];
         }
      }
     
       Collections.reverse(list);
        return list;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna