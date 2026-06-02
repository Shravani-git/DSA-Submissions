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
    Node reverseList(Node head) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        Node temp=head;
       
        while(head!=null){
            a.add(head.data);
            head=head.next;
        }
        
        Collections.reverse(a);
        head=temp;
        int i=0;
        while(head!=null){
            head.data=a.get(i);
            head=head.next;
            i++;
        }
        return temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna