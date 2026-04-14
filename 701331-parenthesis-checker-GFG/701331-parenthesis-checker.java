class Solution {
    public boolean isBalanced(String s) {
        // code here
        LinkedList<Character> l = new LinkedList<>();
        for(char x: s.toCharArray()){
            if(x=='(' || x=='{' || x=='[' ){
                l.addLast(x);
            }
            else if(l.size()!=0 && x==')' && l.peekLast()=='('){
                l.removeLast();
            }
            else if(l.size()!=0 && x==']' && l.peekLast()=='['){
                l.removeLast();
            }
            else if(l.size()!=0 && x=='}' && l.peekLast()=='{'){
                l.removeLast();
            }
            else{
                return false;
            }
        }
        if(l.size()!=0){
            return false;
        }
        return true;
    }
}
