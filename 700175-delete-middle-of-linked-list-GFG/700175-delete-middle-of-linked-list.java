/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        if(head==null || head.next==null){
            return null;
        }
        ArrayList<Integer> a = new ArrayList<>();
        Node temp=head;
        while(head!=null){
            a.add(head.data);
            head=head.next;
        }
        int n= a.size()/2;
        head=temp;
        int count=1;
        for(int i = 0; i < n - 1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna