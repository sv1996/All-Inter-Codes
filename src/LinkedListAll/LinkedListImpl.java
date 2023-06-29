package LinkedListAll;

public class LinkedListImpl {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Node head = node1;
        printLinkedList(head);
        Node newHead = reverseLinkedList(head);
        printLinkedList(newHead);

    }

    private static Node reverseLinkedList(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;

    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println();
    }
}
