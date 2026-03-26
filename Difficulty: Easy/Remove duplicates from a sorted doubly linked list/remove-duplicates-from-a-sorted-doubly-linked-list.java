/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        Node temp=head.next;
        
        while(temp!=null){
            if(temp.data==temp.prev.data){
                temp.prev.next=temp.next;
                if(temp.next!=null)
                temp.next.prev=temp.prev;
            }
            temp=temp.next;
        }
        return head;
    }
}