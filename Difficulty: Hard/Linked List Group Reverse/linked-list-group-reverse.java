/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/

class Solution {
    public Node reverseKGroup(Node head, int k) {
        // code here
        Node prevNode=null;
        Node temp=head;
        while(temp!=null){
            Node kthNode=findKthNode(temp, k);
            if(kthNode==null){
                if(prevNode!=null){
                    prevNode.next=reverse(temp);
                }
                break;
            }
            Node nextNode=kthNode.next;
            kthNode.next=null;
            Node reversedHead=reverse(temp);
            if(temp==head){
                head=reversedHead;
            }
            else{
                prevNode.next=reversedHead;
            }
            prevNode=temp;
            temp=nextNode;
        }
        return head;
    }
    
    private Node findKthNode(Node head, int k){
        Node temp=head;
        for(int i=1; i<k; i++){
            if(temp==null)
            return null;
            temp=temp.next;
        }
        return temp;
    }
    private Node reverse(Node head){
        if(head==null || head.next==null)
        return head;
        Node back=null;
        Node curr=head;
        while(curr!= null){
            Node front=curr.next;
            curr.next=back;
            back=curr;
            curr=front;
        }
        head=back;
        return back;
    }
}