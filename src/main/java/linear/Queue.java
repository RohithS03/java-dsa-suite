package linear;

public class Queue<T> {
    private Object[] elements;
    private int front = 0, rear = -1, size = 0;

    public Queue(int capacity) { elements = new Object[capacity]; }
    public void enqueue(T val) {
        if (size < elements.length) {
            rear = (rear + 1) % elements.length;
            elements[rear] = val;
            size++;
        }
    }
    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (size == 0) return null;
        T val = (T) elements[front];
        front = (front + 1) % elements.length;
        size--;
        return val;
    }
}
