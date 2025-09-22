class SNode {
    int data;
    SNode next;

    SNode(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

class Stack {
    SNode head;

    Stack() {
        this.head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int new_data) {
        SNode new_Node = new SNode(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    void pop() {
        if (isEmpty())
            return;
        SNode temp = head;
        head = head.next;
        System.out.println(temp.data + " " + "is the popped element");
    }

    int peek() {
        if (!isEmpty()) {
            return head.data;
        }
        return Integer.MIN_VALUE;
    }

    void display() {
        SNode n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}

public class linkedlistStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(10);

        st.pop();
        System.out.println("Elements of the stack:");
        st.display();

    }
}
