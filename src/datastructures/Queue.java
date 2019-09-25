package datastructures;

public class Queue {

    int front, rear, size;
    int capacity;
    int[] array;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    void enqueue(int item) {
        if (isFull(this)) {
            System.out.println(
                    "The Queue is full.. can not add any more items !");
            return;
        }

        this.rear = (this.rear + 1) % this.capacity;
        this.array[rear] = item;
        this.size = this.size + 1;
        System.out.println("Item : " + item + " has been enqueued");
    }

    void dequeue() {
        if (isEmpty(this)) {
            System.out.println(" The Queue is empty !");
            return;
        }

        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        System.out.println("Item : " + item + " dequeued successfully !");
    }

    int front() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }

        return this.array[front];
    }

    int rear() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[rear];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(10);

        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        
        queue.dequeue();
        queue.front();
        queue.rear();

    }
}
