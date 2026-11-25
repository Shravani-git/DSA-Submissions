class Solution {
    public int count(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();

              for(Character c : s.toCharArray() ){
                  map.put(c, map.getOrDefault(c, 0) + 1);
              }

              int count =0;
              for(int c : map.values()){
                  if(c % 2 ==0){
                      count++;
                  }
              }

              return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna