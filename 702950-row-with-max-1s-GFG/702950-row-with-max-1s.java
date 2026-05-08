// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int maxrow=-1;
        int maxcount=0;
        for(int i=0;i<=arr.length-1;i++){
            int count=0;
            for(int j=0;j<=arr[i].length-1;j++){
                
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                maxrow=i;
            }
        }
        return maxrow;
    }
}