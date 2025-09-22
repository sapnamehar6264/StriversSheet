class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node() {
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }

            n.next = node;
        }
    }

    public void show() {

        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }

        System.out.println(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {

            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;

        }

    }

    public void deleteAt(int index) {

        if (index == 0) {
            head = head.next;
        } else {

            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {

                n = n.next;
            }

            n1 = n.next;
            n.next = n1.next;
            System.out.println("Deleted element is:" + n1.data);
            n1 = null;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(6);
        list.insertAtStart(2);
        list.insertAt(0, 3);

        list.deleteAt(3);

        list.show();
    }

}
