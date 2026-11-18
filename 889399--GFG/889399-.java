/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int a) {
        data = a;
        next = null;
        prev = null;
    }
} */

class Solution {
    public int findSize(Node head) {
        // Code Here
        int x=0;
                while(head != null){
                    x++;
                    head= head.next;
                }
                return x;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna