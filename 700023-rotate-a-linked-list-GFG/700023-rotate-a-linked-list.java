/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(head==null || head.next==null || k==0){
            return head;
        }
        int length=0;
        Node temp=head;
         while(temp!=null){
            temp=temp.next;
            length++;
        }
        k = k % length;
        if(k == 0){
            return head;
        }
        temp=head;
        int count=1;
         while(count<k ){
            temp=temp.next;
            count++;
        }
       
       
        Node newNode = temp.next;
        temp.next=null;
        Node temp2 = newNode;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=head;
        return newNode;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna