class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for(int i:arr){
            if(i%2==0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }
        
        Collections.sort(even);
        Collections.sort(odd);
        
        int i=0;
        for(int num:even){
            arr[i]=num;
            i++;
        }
        for(int num:odd){
            arr[i]=num;
            i++;
        }
    }
}