/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) {
        // code here
        Node l = head;
        HashSet<Node> a= new HashSet<>();
        while(head!=null){
            if(a.contains(head)){
                return true;
            }
            a.add(head);
            head=head.next;
        }
        return false;
    }
}