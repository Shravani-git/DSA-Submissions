/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node l = head;
        int count=0;
        while(l!=null){
            count++;
            l=l.next;
        }
        l=head;
        int dif=count-k;
        if(dif<0){
            return -1;
        }
        for(int i=1;i<=dif;i++){
            l=l.next;
        }
        return l.data;
    }
}