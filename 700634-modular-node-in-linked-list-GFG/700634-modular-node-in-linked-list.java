/*node class of the linked list is as:
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/

class Solution {
    public int modularNode(Node head, int k) {
        // code here
        int count =1;
        Node temp=head;
        int ans=-1;
        while(head!=null){
            if(count%k==0){
                ans=head.data;
                head=head.next;
                count++;
            }
            else{
                head=head.next;
                count++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna