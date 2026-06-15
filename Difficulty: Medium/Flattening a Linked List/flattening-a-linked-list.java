/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        if(root==null || root.next==null)
        return root;
        
        Node mergedHead= flatten(root.next);
        root=merge(root, mergedHead);
        return root;
        
    }
    
    private Node merge(Node head1, Node head2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.bottom=head1;
                temp=temp.bottom;
                head1=head1.bottom;
            }else{
                temp.bottom=head2;
                temp=temp.bottom;
                head2=head2.bottom;
            }
        }
        if(head1!=null){
            temp.bottom=head1;
            temp=head1;
        }else{
            temp.bottom=head2;
            temp=head2;
        }
        return dummy.bottom;
    }
}