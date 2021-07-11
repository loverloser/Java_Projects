package by.itclass;

public class Stack {
    private int[] storage;
    private int head;
    private int size;

    public Stack() {
        storage = new int[10];
        head = -1;
    }

    public void push(int item) {
        if (size < 10) {
            storage[size] = item;
            head = item;
            size++;
        } else {
            System.out.println("Невозможно добавить элемент");
        }
    }

    public int pop() {
        if (size != 0) {
            size--;
            int result = storage[size];
            storage[size] = 0;
            return result;
        }
        return -999;
    }

    public int[] getStorage() {
        return storage;
    }
}
