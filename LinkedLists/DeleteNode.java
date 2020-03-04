package LinkedLists;

public class DeleteNode {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void deleteNode(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();
        deleteNode.push(4);
        deleteNode.push(3);
        deleteNode.push(2);
        deleteNode.push(1);
        deleteNode.deleteNode(3);

        Node n = deleteNode.head;
        while (n != null) {
            System.out.print(n.data + " " + n.next + "    ");
            n = n.next;
        }
    }
}
