class Solution {

    // Push elements of an array into a stack.
    public static Stack<Integer> push(int arr[]) {
        
        
                // Your code here
                Stack<Integer> st=new Stack<>();
                for(int i=0;i<arr.length;i++){
        st.push(arr[i]);
                }
                return st;
    }
    // Print elements of a stack and pop them.
    public static void printAndPop(Stack<Integer> s) {
        // code here
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna