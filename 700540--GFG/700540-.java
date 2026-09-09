/* Definition of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class Solution {
    public Node sortedInsert(Node head, int key) {
        // code here
        // Add your code here.
              Node n = new Node(key);
                  if(head.data>key){
                      n.next=head;
                      head=n;
                  }
                  else{
                      Node ptr=head;
                      while(ptr.next!=null && ptr.next.data<key){
                          ptr=ptr.next;
                      }
                      n.next=ptr.next;
                      ptr.next=n;
                  }
                  return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna