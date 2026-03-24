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
        Node zeroHead=new Node(-1), zero=zeroHead;
        Node oneHead=new Node(-1), one=oneHead;
        Node twoHead=new Node(-1), two=twoHead;
        
        Node temp=head;
        
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        zero.next=(oneHead.next!=null)?oneHead.next:twoHead.next;
        one.next=twoHead.next;
        two.next=null;
        
        return zeroHead.next;
    }
}