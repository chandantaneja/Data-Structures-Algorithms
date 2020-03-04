package LinkedLists;

public class DeleteList {
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

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        DeleteList deleteList = new DeleteList();
        deleteList.push(1);
        deleteList.push(2);
        deleteList.push(3);
        deleteList.push(4);

        deleteList.printList();

        deleteList.deleteWholeList();
        deleteList.printList();
    }

    private void deleteWholeList() {
        head = null;
    }
}
