package linear;

public class Stack<T> {
    private Object[] elements;
    private int top = -1;

    public Stack(int capacity) { elements = new Object[capacity]; }
    public void push(T val) { if (top < elements.length - 1) elements[++top] = val; }
    @SuppressWarnings("unchecked")
    public T pop() { return top >= 0 ? (T) elements[top--] : null; }
    public boolean isEmpty() { return top == -1; }
}
