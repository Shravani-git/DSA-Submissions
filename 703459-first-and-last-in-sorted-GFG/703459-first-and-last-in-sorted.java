class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> h= new ArrayList<>();
        h.add(-1);
        h.add(-1);
        int left=0;
        int right = arr.length-1;
        while(left<=right){
            if(arr[left]==x && arr[right]==x){
                h.add(0,left);
                h.add(1,right);
                break;
            }
            if(arr[left]!=x){
                left++;
            }
            if(arr[right]!=x){
                right--;
            }
        }
        return h;
    }
}
