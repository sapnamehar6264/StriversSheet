class Queue {
    int front, rear, size, capacity;
    int[] s;

    public Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = -1;
        size = 0;
        s = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
            return -1;
        }

        rear = (rear + 1) % capacity;
        s[rear] = x;
        size++;
        return x;
    }

    public int dqueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int temp = s[front];
        front = (front + 1) % capacity;
        size--;
        return temp;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("No element! queue is empty");
            return -1;
        }

        return s[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("No element! queue is empty");
            return -1;
        }

        return s[rear];
    }

}

public class queueUsingCircularArray {
    public static void main(String[] args) {
        Queue s = new Queue(6);
        s.enqueue(21);
        s.enqueue(20);
        s.enqueue(29);
        s.enqueue(25);

        System.out.println(s.dqueue() + " " + "is removed from the queue");
        while (!s.isEmpty()) {
            System.out.println(s.getFront() + " ");
            s.dqueue();
        }

    }
}
