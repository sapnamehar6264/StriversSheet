class ArrayStack {
    int top, cap;
    int[] s;

    public ArrayStack(int cap) {
        this.cap = cap;
        top = -1;
        s = new int[cap];
    }

    public boolean push(int x) {
        if (top >= cap - 1) {
            System.out.println("Stack overflow");
            return false;
        } else {
            s[++top] = x;
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        return s[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        return s[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

}

public class stackUsingArray {
    public static void main(String[] args) {
        ArrayStack a = new ArrayStack(5);
        a.push(10);
        a.push(22);
        a.push(26);
        a.push(13);

        System.out.println(a.pop() + " " + "is the element popped");

        while (!a.isEmpty()) {
            System.out.println(a.pop() + " ");
        }

    }
}
