public class Queue {
    int capacity, size;
    int front;
    int rear;
    int[] arr;

    Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = capacity - 1;
        arr = new int[capacity];
    }

    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);

    }
}
