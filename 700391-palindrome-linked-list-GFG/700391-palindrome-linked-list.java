/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node l = head;
        ArrayList<Integer> a = new ArrayList<>();
        if(head == null || head.next == null){
            return true;
        }
        while(head!=null){
            a.add(head.data);
            head=head.next;
        }
        head=l;
        int i=0;
        int j=a.size()-1;
        while(i<=j){
            if(!a.get(i).equals(a.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}