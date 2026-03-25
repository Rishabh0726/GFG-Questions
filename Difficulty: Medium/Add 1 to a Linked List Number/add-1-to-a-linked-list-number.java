/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
        head=reverse(head);
        int carry=1;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            int value=temp.data + carry;
            if(value>9){
                temp.data=0;
                carry=1;
            }else{
                temp.data=value;
                carry=0;
            }
            prev=temp;
            temp=temp.next;
        }
        if(carry==1)
        prev.next=new Node(1);
        
        return reverse(head);
        
    }
    private Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        
        return prev;
    }
}