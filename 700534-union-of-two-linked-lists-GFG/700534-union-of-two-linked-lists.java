/*

class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }

}
*/
class Solution {
    public Node makeUnion(Node head1, Node head2) {
        // code here
        Node head= new Node(0);
        Node curr = head;
        LinkedHashSet<Integer> h = new LinkedHashSet<>();
        while(head1!=null){
            h.add(head1.data);
            head1=head1.next;
        }
        while(head2!=null){
            h.add(head2.data);
            head2=head2.next;
        }
        for(int num:h){
            Node temp=new Node(num);
            curr.next=temp;
            curr=curr.next;
        }
        return head.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna