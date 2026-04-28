/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        ArrayList<Integer> a =new ArrayList<>();
        Node l = head;
        while(head!=null){
            a.add(head.data);
            head=head.next;
        }
        head=l;
        int mid = a.size()/2;
        return a.get(mid);
    }
}