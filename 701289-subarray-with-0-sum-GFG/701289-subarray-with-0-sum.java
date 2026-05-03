class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> a = new HashSet<>();
        int sum = 0;
        for(int num : arr){
            sum = sum+num;
            if(sum == 0 || a.contains(sum)){
                return true;
            }
            else{
                a.add(sum);
            }
        }
        return false;
    }
}