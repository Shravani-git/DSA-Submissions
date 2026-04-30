// User function Template for Java
class Solution {
    public boolean isIdentical(List<Integer> a, List<Integer> b) {
        // Your code goes here.
        Collections.sort(a);
        Collections.sort(b);
        if(a.size()!=b.size()){
            return false;
        }
        for(int i=0;i<=a.size()-1;i++){
            if(!(a.get(i)).equals(b.get(i))){
                return false;
            }
        }
        return true;
    }
}