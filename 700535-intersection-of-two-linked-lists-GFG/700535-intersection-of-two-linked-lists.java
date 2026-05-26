/* structure of list node:

class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

*/

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
        Node ans= new Node(0);
        Node temp=ans;
        HashSet<Integer> h=new HashSet<>();
        while(head2!=null){
            h.add(head2.data);
            head2=head2.next;
        }
        while(head1!=null){
            if(h.contains(head1.data)){
                Node newNode = new Node(head1.data);
                temp.next=newNode;
                temp=temp.next;
            }
            head1=head1.next;
        }
        return ans.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna