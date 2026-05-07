/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node removeDuplicates(Node head) {
        // code here
        Node l = head;
        HashSet<Integer> h = new HashSet<>();
        while(head!=null){
            while(head.next!=null && head.data == head.next.data){
                head.next= head.next.next;
            }
            head=head.next;
        }
        return l;
    }
}