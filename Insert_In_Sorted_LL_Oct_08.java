package geeks_for_geeks;

public class Insert_In_Sorted_LL_Oct_08 {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    Node sortedInsert(Node head1, int key) {

        Node newNode = new Node(key);
        if(head1==null){
            return head1;
        }
        if(head1.data>key){
            newNode.next = head1;
            head1=newNode;
            return head1;
        }
        Node temp = head1;
        Node last = null;
        while(temp!=null && temp.data<=key){
            last = temp;
            temp = temp.next;
        }
        last.next= newNode;
        newNode.next = temp;
        return head1;
    }
}
