package LinkedLists;


//public class LinkedList {
//    Node head;
//
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//
//    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
//
//        linkedList.head.next = second;
//        second.next = third;
//
//        linkedList.printList();
//    }
//
//    private void printList() {
//        Node n = head;
//        while (n != null) {
//            System.out.print(n.data + " ");
//            n = n.next;
//        }
//    }
//}


public class LinkedList {
//    Node head;

    private static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
//        linkedList.head = new Node(0);
        Node head = new Node(0);
        Node second = new Node(1);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }

        System.out.println(head.data + " " + head.next.toString());
        System.out.println(second.data + " " + head.next.toString());
        System.out.println(third.data + " " + third.next);
        System.out.println(fourth.data + " " + fourth.next);
        System.out.println(fifth.data + " " + fifth.next);

//        System.out.println(second.next);
//        System.out.println(head.next);
    }
}