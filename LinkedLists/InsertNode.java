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

    public void push(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int new_data) {
        if (prevNode == null) {
            System.out.println("The previous node cannot be null");
            return;
        }
        Node newNode = new Node(new_data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void append(int new_data) {
        Node newNode = new Node(new_data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        InsertNode insertNode = new InsertNode();
        insertNode.append(6);
        insertNode.push(7);
        insertNode.push(1);
        insertNode.append(4);
        insertNode.insertAfter(insertNode.head.next, 8);
        System.out.print("Created Linked list is : ");
        insertNode.printList();
    }
}