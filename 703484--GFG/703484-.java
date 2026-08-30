class Solution {
    public ArrayList<Integer> arranged(int[] arr) {
        // code here
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int i=0;
        int j=0;
        while(i<pos.size() && j<neg.size()){
            ans.add(pos.get(i++));
            ans.add(neg.get(j++));
        }
        while(i<pos.size() ){
            ans.add(pos.get(i++));
        }
        while(j<neg.size() ){
            ans.add(neg.get(j++));
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna