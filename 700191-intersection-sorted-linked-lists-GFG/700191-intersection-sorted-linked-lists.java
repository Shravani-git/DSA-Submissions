/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node m1 =head1;
        Node m2 =head2;
        Node ans= new Node(0);
        Node temp=ans;
        while(m1!=null && m2!=null){
            if(m1.data==m2.data){
                temp.next=new Node(m1.data);
                temp=temp.next;
                m1=m1.next;
                m2=m2.next;
            }
            else if(m2.data>m1.data){
                m1=m1.next;
            }
            else{
                m2=m2.next;
            }
        }
        return ans.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna