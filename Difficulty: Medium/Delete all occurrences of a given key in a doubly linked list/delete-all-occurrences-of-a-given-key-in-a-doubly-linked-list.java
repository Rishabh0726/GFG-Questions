/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        while(head.data==x){
            head=head.next;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==x){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
            }
            temp=temp.next;
        }
        if(temp.data==x)
        temp.prev.next=null;
        
        return head;
        
    }
        
    
}