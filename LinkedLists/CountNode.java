package LinkedLists;

public class CountNode {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void countNodesIteratively() {
        if (head == null) {
            System.out.println("0 No nodes present");
            return;
        }
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        System.out.println("Iteration : " + count + " nodes present");
    }

    public void countNodesRecursively() {
        System.out.println("Recursion : " + getCountRec(head) + " nodes present");
    }

    public int getCountRec(Node node) {
        if (node == null) return 0;
        else {
            return 1 + getCountRec(node.next);
        }
    }

    public static void main(String[] args) {
        CountNode countNode = new CountNode();
        countNode.push(5);
        countNode.push(4);
        countNode.push(3);
        countNode.push(2);
        countNode.push(1);

        countNode.countNodesIteratively();

        countNode.countNodesRecursively();
    }
}
