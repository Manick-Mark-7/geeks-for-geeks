package geeks_for_geeks;

public class Pairwise_swap_elements_of_a_LL_Oct_07 {
    class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    public Node pairwiseSwap(Node head) {
        if (head == null || head.next == null)
            return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        while (head != null && head.next != null) {
            Node first = head;
            Node second = head.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            head = first.next;
        }
        return dummy.next;
    }
}
