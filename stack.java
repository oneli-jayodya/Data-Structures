package dataStructuers;

class Stack {
    private char[] items;
    private int top;

    public Stack(int capacity) {
        items = new char[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }

    public void push(char item) {
        if (isFull()) {
            throw new IllegalStateException("Stack overflow");
        }
        items[++top] = item;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow");
        }
        return items[top--];
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow");
        }
        return items[top];
    }
}
