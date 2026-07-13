class Solution {
    int countWords(String[] list) {
        // code here
        int n=list.length;
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++){
            String word = list[i];
            if(map.containsKey(word)){
                int prevFreq=map.get(word);
                map.put(word,prevFreq+1);
            }else{
                map.put(word,1);
            }
        }
        for(String s:map.keySet()){
            int value = map.get(s);
            if(value==2){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna