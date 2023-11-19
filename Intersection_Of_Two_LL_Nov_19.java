package geeks_for_geeks;

public class Intersection_Of_Two_LL_Nov_19 {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public  Node findIntersection(Node head1, Node head2)
    {
        Node newNode = new Node(0);
        Node ptr = newNode;

        while(head1!=null && head2!=null){
            if(head1.data == head2.data){
                ptr.next = new Node(head1.data);
                ptr = ptr.next;
                head1 = head1.next;
                head2 = head2.next;
            }
            else if(head1.data<head2.data){
                head1 = head1.next;
            }
            else
                head2 = head2.next;
        }
        return newNode.next;
        }
    }
}
