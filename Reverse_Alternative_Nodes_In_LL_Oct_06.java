package geeks_for_geeks;

public class Reverse_Alternative_Nodes_In_LL_Oct_06 {
    class Node{
        int data;
        Node next;
        Node(int key){
            data = key;
            next = null;
        }
    }
    public  void rearrange(Node odd) {
        Node temp = odd;
        Node link = null;
        while (temp != null) {
            if (temp.next != null) {
                Node newnode = new Node(temp.next.data);
                newnode.next = link;
                link = newnode;
                temp.next = temp.next.next;
            }
            if (temp.next == null) {
                temp.next = link;
                break;
            }

            temp = temp.next;
        }
    }
}
