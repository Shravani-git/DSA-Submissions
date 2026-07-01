class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pprod=new int[nums.length];
        int[] sprod=new int[nums.length];
        int i;
        int prod=1;
        for(i=0;i<=nums.length-1;i++){
            prod=prod*nums[i];
            pprod[i]=prod;
        }
        prod=1;
         for(i=nums.length-1;i>=0;i--){
            prod=prod*nums[i];
            sprod[i]=prod;
        }
        if(nums.length==2){
            nums[0]=sprod[1];
            nums[1]=pprod[0];
            return nums;
        }
        nums[0]=sprod[1];
        nums[nums.length-1]=pprod[nums.length-1-1];
        for(i=1;i<=nums.length-2;i++){
            nums[i]=pprod[i-1]*sprod[i+1];
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna