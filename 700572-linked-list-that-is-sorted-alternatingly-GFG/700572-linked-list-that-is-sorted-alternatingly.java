/*
class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node sort(Node head) {
        // code here
        ArrayList<Integer> a= new ArrayList<>();
        Node l=head;
        while(head!=null){
            a.add(head.data);
            head=head.next;
        }
        Collections.sort(a);
        head=l;
        int i=0;
        while(head!=null){
            head.data=a.get(i);
            i++;
            head=head.next;
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna