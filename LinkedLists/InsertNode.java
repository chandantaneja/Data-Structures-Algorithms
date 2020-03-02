package LinkedLists;

public class InsertNode {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        InsertNode insertNode = new InsertNode();
        insertNode.head = new Node(0);
        Node first = new Node(1);
        Node second = new Node(2);

        insertNode.head.next = first;
        first.next = second;


    }

}