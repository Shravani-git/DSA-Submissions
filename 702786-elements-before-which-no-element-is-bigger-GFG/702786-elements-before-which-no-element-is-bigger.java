class Solution {
    public int countElements(int[] arr) {
        // code here
        int count =1;
        int max=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                count++;
                max= arr[i];
            }
        }
        return count;
    }
}
