/*Complete the function(s) below*/
class Solution {
    public boolean searchEle(List<Integer> arr, int x) {
        // add code here.
        for(int i:arr){
            if(i==x){
                return true;
            }
           
        }
         return false;
    }

    public void insertEle(List<Integer> arr, int y, int yi) {
        // add code here.
        arr.add(yi, y);
    }

    public void deleteEle(List<Integer> arr, int z) {
        // add code here.
        arr.remove(Integer.valueOf(z));
       
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna