package LinkedLists;

public class DeletePos {
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

    public void deleteAtPos(int pos) {
        if (head == null) return;
        Node temp = head, prev = null;
        if (pos == 0){
            head = temp.next;
        }
        int count = 0;
        while (temp != null && count < pos){
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (count > pos || temp == null || prev == null) return;
        prev.next = temp.next;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        DeletePos deletePos = new DeletePos();
        deletePos.push(3);
        deletePos.push(2);
        deletePos.push(1);
        deletePos.push(0);

        deletePos.printList();

        System.out.println();
        deletePos.deleteAtPos(0);
        deletePos.printList();
    }
}
