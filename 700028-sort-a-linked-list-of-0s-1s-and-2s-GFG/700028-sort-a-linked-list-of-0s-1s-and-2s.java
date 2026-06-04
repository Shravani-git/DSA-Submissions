/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        Node temp=head;
        while(head!=null){
            a.add(head.data);
            
            head=head.next;
        }
        Collections.sort(a);
        head=temp;
        for(int i=0;i<=a.size()-1;i++){
            temp.data=a.get(i);
            temp=temp.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna