/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        if(arr.length==0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<=arr.length-1;i++){
            Node newNode= new Node(arr[i]);
            temp.next=newNode;
            temp=newNode;
        }
        return head;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna