/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        Node l = head;
        while(head!=null){
            Node runner= head;
            while(runner.next!=null){
                if(runner.next.data==head.data){
                    runner.next=runner.next.next;
                }
                else{
                    runner=runner.next;
                }
            }
            head=head.next;
        }
        return l;
    }
}