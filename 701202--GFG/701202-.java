class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer,Integer> h= new HashMap<>();
        int n=arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<=n-1;i++){
            if(h.containsKey(arr[i])){
                int count=h.get(arr[i]);
                h.put(arr[i],count+1);
            }
            else{
                h.put(arr[i],1);
            }
        }
        for(int i=1;i<=n;i++){
            if(h.containsKey(i)){
                a.add(h.get(i));
            }
            else{
                a.add(0);
            }
        }
        return a;
    }
}
