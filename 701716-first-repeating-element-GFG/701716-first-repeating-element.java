class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> h= new HashMap<>();
        
        for(int i:arr){
            if(h.containsKey(i)){
                int count=h.get(i);
                h.put(i,count+1);
            }
            else{
                h.put(i,1);
            }
            
        }
        for(int i=0;i<=arr.length-1;i++){
            if(h.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna