/* Structure of a Linked List node
class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
} */

class Solution {
    public Node mergeSort(Node head) {
        // code here
        if(head==null || head.next==null)
        return head;
        
        Node slow=head;
        Node fast=head;
        Node prev=slow;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        // this line helps in dividing the LL in 2 parts by breaking it just 
        // before the slow
        prev.next=null;
        Node l1=mergeSort(head);
        Node l2=mergeSort(slow);
        
        return mergeLL(l1, l2);
    }
    public Node mergeLL(Node l1, Node l2){
        Node result=new Node(-1);
        Node dummy=result;
        while(l1!=null && l2!=null){
            if(l1.data<=l2.data){
                dummy.next=l1;
                l1=l1.next;
            }else{
                dummy.next=l2;
                l2=l2.next;
            }
            dummy=dummy.next;
        }
        if(l1!=null)
        dummy.next=l1;
        if(l2!=null)
        dummy.next=l2;
        
        return result.next;
    }
}